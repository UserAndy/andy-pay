package org.andy.pay.service.impl;

import org.andy.pay.common.bean.ResultCode;
import org.andy.pay.common.utils.UuidUtils;
import org.andy.pay.enums.LoginType;
import org.andy.pay.mapper.LoginLogMapper;
import org.andy.pay.mapper.UserMapper;
import org.andy.pay.model.LoginLog;
import org.andy.pay.model.User;
import org.andy.pay.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 用户信息service
 * Created by andy on 16-12-1.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LoginLogMapper loginLogMapper;

    public void login(User user) {
        //获取版本信息
      /*  String Agent = request.getHeader("User-Agent");*/
        LoginLog log = new LoginLog();
        log.setUser_id(user.getId());
        log.setLogin_time(new Date());
        log.setId(UuidUtils.getUuid());
        /*log.setLogin_browser(Agent);
        log.setLogin_ip(request.getRemoteAddr());*/
        log.setLogin_type(LoginType.WEB.getStatus());
        loginLogMapper.addLog(log);
    }

    public boolean deleteUser(String id) {
        return false;
    }

    /**
     * 用户注册(待修改)
     * @param user
     * @param request
     * @return
     */
    public ResultCode register(User user, HttpServletRequest request) {
        ResultCode resultCode = new ResultCode();
        User info = userMapper.getUesrInfo(user.getUsername());
        if(info==null){
            user.setId(UuidUtils.getUuid());
            user.setRegister_time(new Date());
            user.setRegister_ip(request.getRemoteAddr());
            boolean result = userMapper.addUser(user);
            if(result){
                resultCode.setSuccess(true);
            }
        }else {
           resultCode.setErrormsg("用户已存在!");
        }
        return resultCode;
    }

    public User findByUsername(String username) {
        return userMapper.getUesrInfo(username);
    }
}
