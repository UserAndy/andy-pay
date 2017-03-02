package org.andy.pay.service.impl;

import org.andy.pay.common.utils.StringUtils;
import org.andy.pay.common.utils.SystemUtils;
import org.andy.pay.common.utils.UuidUtils;
import org.andy.pay.common.utils.ValidateUtils;
import org.andy.pay.contants.ResultCodeContants;
import org.andy.pay.contants.UserContant;
import org.andy.pay.enums.LoginType;
import org.andy.pay.mapper.LoginLogMapper;
import org.andy.pay.mapper.UserMapper;
import org.andy.pay.model.LoginLog;
import org.andy.pay.model.ResultCode;
import org.andy.pay.model.User;
import org.andy.pay.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * description: 这是登录日志service实现类
 *
 * @author: andy
 * Created by 2016/11/16 12:45
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LoginLogMapper loginLogMapper;


    public ResultCode addBasicUser(User user) {
        ResultCode resultCode = new ResultCode();
        user.setRegister_time(new Date());
        boolean result = userMapper.addBasicUser(user);
        resultCode.setSuccess(result);
        return resultCode;
    }

    public ResultCode deleteUser(String userId, Date handler_time, String handler_user) {
        ResultCode resultCode = new ResultCode();
        boolean result = userMapper.deleteUser(userId,handler_time,handler_user);
        resultCode.setSuccess(result);
        return resultCode;
    }

    public ResultCode freezeUser(String userId, String handlerUser, Date handlerTime) {
        ResultCode resultCode = new ResultCode();
        boolean result = userMapper.freezeUser(userId,handlerUser,handlerTime);
        resultCode.setSuccess(result);
        return resultCode;
    }

    public ResultCode unfreezeUser(String userId, String handlerUser, Date handlerTime) {
        ResultCode resultCode = new ResultCode();
        boolean result = userMapper.unfreezeUser(userId,handlerUser,handlerTime);
        resultCode.setSuccess(result);
        return resultCode;
    }

    public ResultCode modifyBasicUser(User user) {
        ResultCode resultCode = new ResultCode();
        boolean result = userMapper.modifyBasicUser(user);
        resultCode.setSuccess(result);
        return resultCode;
    }

    public User getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    public User getUserByLoginName(String loginName) {
        return userMapper.getUserByLoginName(loginName);
    }

    public User getUserByTelephone(String telephone) {
        return userMapper.getUserByTelephone(telephone);
    }

    public User getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }


    /**
     * 重置密码
     * @param user  待修改密码的用户
     * @return
     */
    public ResultCode resetPassword(User user,HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        User sessionUser = (User)httpSession.getAttribute(UserContant.SESSION_USER);
        ResultCode resultCode = vaidateModifyPassword(sessionUser,user,request);
        if(resultCode.isSuccess()) {
            user.setId(sessionUser.getId());
            user.setModify_person(sessionUser.getId());
            user.setModify_time(new Date());
            user.setModify_ip(request.getRemoteAddr());
            boolean result = userMapper.modifyPassword(user);
            resultCode.setSuccess(result);
        }
        return resultCode;
    }

    /**
     * 验证修改密码
     * @return
     */
    private ResultCode vaidateModifyPassword(User sessionUser,User paramsUser,HttpServletRequest request){
        ResultCode resultCode = new ResultCode();
        String currentpassword = sessionUser.getPassword();
        //
        String confrim_password = request.getParameter("confirm_password"); //确认新密码
        String params_currentPassword = paramsUser.getPassword();  //  新密码
        String salt = paramsUser.getSalt();                            //当前密码
        if(StringUtils.isNotEmpty(params_currentPassword)&&StringUtils.isNotEmpty(confrim_password)) {
            if (currentpassword.equals(salt)) {   //当前密码一致
                if (confrim_password.equals(params_currentPassword)) {
                    resultCode.setSuccess(true);
                    resultCode.setErrcode(ResultCodeContants.SUCCESS);
                } else {
                    resultCode.setErrcode(ResultCodeContants.PARAMS_MATCH);  //新密码与确认密码不一致
                }
            } else {
                resultCode.setErrcode(ResultCodeContants.RESULT_EXISTS);    //当前密码不正确
            }
        }else{
            resultCode.setErrcode(ResultCodeContants.PARAMS_EMPTY);
        }
        return resultCode;
    }

    /**
     * 用户登录逻辑的处理
     * @param
     * @return
     */
    public void login(String email,HttpServletRequest request) {
        //添加到session中
        HttpSession session = request.getSession();
        System.out.println("sessionId- UserServiceImpl---->"+session.getId());
        User sessionUser =userMapper.getUserByEmail(email);
        session.setAttribute(UserContant.SESSION_USER,sessionUser);
        //添加登录日志
        LoginLog loginLog = new LoginLog();
        loginLog.setId(UuidUtils.getUuid());
        loginLog.setLogin_time(new Date());
        loginLog.setUser_id(sessionUser.getId());
        loginLog.setIp(request.getRemoteAddr());
        loginLog.setOs(SystemUtils.getSystemProperties(SystemUtils.OS_NAME));
        loginLog.setType(LoginType.PC.getCode());
        loginLog.setBrower(request.getHeader("user-agent"));
        loginLog.setRemark("用户登录");
        loginLog.setInfo("用户["+sessionUser.getId()+"]通过["+ LoginType.PC.getMessage()+"]登录成功");
        loginLog.setCreate_time(new Date());
        loginLogMapper.addLog(loginLog);
    }

    /**
     *  #{id},#{username},#{login_name},#{nick_name}
     *  #{password},#{salt},#{email},#{telephone},
     *  #{sex},#{register_ip},
     *  #{register_time},#{register_person},#{is_freeze},#{is_use})
     * @param user      待注册的用户
     * @param request   请求
     * @return
     */
    public ResultCode register(User user, HttpServletRequest request) {
        ResultCode resultCode = new ResultCode();
        String name = UuidUtils.getUserName();
        user.setId(UuidUtils.getUuid());
        user.setUser_name(name);
        user.setLogin_name(name);
        user.setRegister_time(new Date());
        user.setRegister_ip(request.getRemoteAddr());
        boolean result = userMapper.addBasicUser(user);
        if(result){
            resultCode.setSuccess(true);
            resultCode.setErrcode(ResultCodeContants.SUCCESS);
        }
        return resultCode;
    }

    public ResultCode validateEmail(String email) {
        ResultCode resultCode = new ResultCode();
        if(StringUtils.isNotEmpty(email)){
            if(ValidateUtils.isEmail(email)){
                User user = userMapper.getUserByEmail(email);
                if(user==null){
                    resultCode.setSuccess(true);
                    resultCode.setErrcode(ResultCodeContants.SUCCESS);
                }else{                   //用户已存在
                    resultCode.setErrcode(ResultCodeContants.RESULT_EXISTS);
                }
            }else{                      //邮箱不合法
                resultCode.setErrcode(ResultCodeContants.PARAMS_MATCH);
            }
        }else{                          //邮箱不能为空
            resultCode.setErrcode(ResultCodeContants.PARAMS_EMPTY);
        }
        return resultCode;
    }
}