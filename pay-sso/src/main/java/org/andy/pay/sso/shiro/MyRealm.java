package org.andy.pay.sso.shiro;

import org.andy.pay.model.User;
import org.andy.pay.service.UserInfoService;
import org.andy.pay.service.impl.UserInfoServiceImpl;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 在这里处理
 * description: 这是自定义权限域
 * @author: andy
 * Created by 2016/11/11 17:35
 * @Component: 该bean名 在sso-shiro.xml中使用,修改后，请在sso-shiro文件中对应修改
 */
@Component("myRealm")
public class MyRealm extends AuthorizingRealm {

    private Logger logger = Logger.getLogger(MyRealm.class);
    @Autowired
    private UserInfoServiceImpl userInfoService;
/*
    @Autowired
    private HttpServletRequest request;*/

    /**
     * 在判断用户权限的时候会调用
     *
     * @param principalCollection
     * @return　(获取权限信息)
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("doGetAuthorizationInfo----->");
        return null;
    }

    /**
     * 待改进,需要限制填写次数
     * 在调用 Subject subject = SecurityUtils.getSubject(); 就会执行
     *
     * @param authenticationToken
     * @return (获取授权身份信息)
     * @throws AuthenticationException
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("doGetAuthenticationInfo----->");
        String username = (String)authenticationToken.getPrincipal();  //用户名
        String password = new String((char[])authenticationToken.getCredentials());//密码
        User user = userInfoService.findByUsername(username);
        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }
        if(Boolean.TRUE.equals(user.is_locked())) {
            throw new LockedAccountException(); //帐号锁定
        }
        if(!user.getPassword().equals(password)){    //密码不正确 (密码为加密后存储的)
            throw new IncorrectCredentialsException();
        }
        //
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(), //用户名
                user.getPassword(), //密码 //salt=username+salt
                getName()); //realm name
        //
        userInfoService.login(user);
        return authenticationInfo;
    }
}