package org.andy.pay.controller;

import org.andy.pay.basic.BasicController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: Andy
 * @date: 2017-02-22
 * @blog: www.andyqian.com
 */
@Controller
@RequestMapping("/user")
public class UserController extends BasicController{

    /**
     * 编辑用户
     * @return
     */
    @RequestMapping(value = "editUser",method ={RequestMethod.GET})
    public ModelAndView editUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/edituser");
        return modelAndView;
    }

    /**
     * 重置密码
     * @return
     */
    @RequestMapping(value = "resetPassword",method ={RequestMethod.GET})
    public ModelAndView resetPassword(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/resetPassword");
        return modelAndView;
    }

    /**
     * 添加用户
     * @return
     */
    @RequestMapping(value = "adduser",method = {RequestMethod.GET})
    public ModelAndView addUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/adduser");
        return modelAndView;
    }
}
