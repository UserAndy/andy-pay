package org.andy.pay.controller;

import org.andy.pay.basic.BasicController;
import org.andy.pay.contants.UserContant;
import org.andy.pay.model.User;
import org.andy.pay.page.PageParams;
import org.andy.pay.page.PageResult;
import org.andy.pay.service.impl.LoginLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.security.krb5.internal.PAData;

import javax.servlet.http.HttpSession;

/**
 * @description:     登录日志 controller
 * @author: Andy
 * @date: 2017-03-02
 * @blog: www.andyqian.com
 */
@Controller
@RequestMapping("/log")
public class LoginLogController extends BasicController{

    /**
     * 登录日志service
     */
    @Autowired
    private LoginLogServiceImpl loginLogService;
    /**
     * 登录日志 controller
     */
    @RequestMapping(value = "list",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public PageResult list(PageParams params,HttpSession session){
        User user = (User)session.getAttribute(UserContant.SESSION_USER);
        PageResult result = loginLogService.getUserLoginLog(user.getId(),params);
        return result;
    }

}
