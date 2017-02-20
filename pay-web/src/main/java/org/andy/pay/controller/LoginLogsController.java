package org.andy.pay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @description: 登录日志controller
 * @author: Andy
 * @date: 2017-02-14
 * @blog: www.andyqian.com
 */
@Controller
@RequestMapping("system")
public class LoginLogsController extends BasicController{


    /**
     * 登录日志信息
     * http://localhost:8080/pay-web/system/logs
     */
    @RequestMapping(value="/logs",method = {RequestMethod.GET})
    public ModelAndView login(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/system/loginlog");
        return modelAndView;
    }

    /**
     * 登录日志的信息
     * @return
     */
    @RequestMapping(value = "/info",method ={RequestMethod.GET})
    public ModelAndView info(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/system/info");
        return modelAndView;
    }

}
