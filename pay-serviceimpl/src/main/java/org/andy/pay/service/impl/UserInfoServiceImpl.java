package org.andy.pay.service.impl;

import org.andy.pay.common.bean.ResultCode;
import org.andy.pay.common.utils.UuidUtils;
import org.andy.pay.enums.LoginType;
import org.andy.pay.mapper.LogMapper;
import org.andy.pay.mapper.UserMapper;
import org.andy.pay.model.LoginLog;
import org.andy.pay.model.UserInfo;
import org.andy.pay.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * 用户信息service
 * Created by andy on 16-12-1.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LogMapper logMapper;

    public void login(UserInfo user,HttpServletRequest request) {
        //获取版本信息
        String Agent = request.getHeader("User-Agent");
        LoginLog log = new LoginLog();
        log.setUser_id(user.getId());
        log.setLogin_time(new Date());
        log.setId(UuidUtils.getUuid());
        log.setLogin_browser(Agent);
        log.setLogin_ip(request.getRemoteAddr());
        log.setLogin_type(LoginType.WEB.getStatus());
        logMapper.addLog(log);
    }

    public boolean deleteUser(String id) {
        return false;
    }

    /**
     * 用户注册(待修改)
     * @param userInfo
     * @param request
     * @return
     */
    public ResultCode register(UserInfo userInfo,HttpServletRequest request) {
        ResultCode resultCode = new ResultCode();
        UserInfo info = userMapper.getUesrInfo(userInfo.getUsername());
        if(info==null){
            userInfo.setId(UuidUtils.getUuid());
            userInfo.setRegister_time(new Date());
            userInfo.setRegister_ip(request.getRemoteAddr());
            boolean result = userMapper.addUser(userInfo);
            if(result){
                resultCode.setSuccess(true);
            }
        }else {
           resultCode.setErrormsg("用户已存在!");
        }
        return resultCode;
    }

    public UserInfo findByUsername(String username) {
        return userMapper.getUesrInfo(username);
    }
}
