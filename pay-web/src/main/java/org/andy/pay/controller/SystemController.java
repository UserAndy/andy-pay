package org.andy.pay.controller;

import org.andy.pay.basic.BasicController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description: 登录 Controller
 * @author: Andy
 * @date: 2017-02-22
 * @blog: www.andyqian.com
 */
@Controller
@RequestMapping("system")
public class SystemController extends BasicController{

    /**
     * 日志 controller
     */
    @RequestMapping(value = "logs",method ={RequestMethod.GET})
    public ModelAndView logs(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/system/loginlogs");
        return modelAndView;
    }
}
