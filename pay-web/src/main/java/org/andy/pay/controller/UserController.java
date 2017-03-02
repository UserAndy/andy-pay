package org.andy.pay.controller;

import org.andy.pay.basic.BasicController;
import org.andy.pay.common.utils.StringUtils;
import org.andy.pay.contants.UserContant;
import org.andy.pay.model.ResultCode;
import org.andy.pay.model.User;
import org.andy.pay.service.impl.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author: Andy
 * @date: 2017-02-22
 * @blog: www.andyqian.com
 * 测试帐号: 804139028@qq.com
 * 密码: 123456
 */
@Controller
@RequestMapping("/user")
public class UserController extends BasicController{

    @Autowired
    private UserServiceImpl userService;

    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value="login",method={RequestMethod.GET})
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login");
        return modelAndView;
    }

    /**
     * 用户登录  http://localhost:8080/pay-web/user/login
     * @param user  待登录的用户
     * @param request
     * @return
     */
    @RequestMapping(value="login",method={RequestMethod.POST})
    @ResponseBody
    public ResultCode login(User user, HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        ResultCode resultCode = new ResultCode();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getEmail(),user.getPassword());
        String remember = request.getParameter("remember");
        if(!StringUtils.isEmpty(remember)){               //是否记住密码
            token.setRememberMe(true);
        }else{
            token.setRememberMe(false);
        }
        String message = "";
        boolean mobileName = false;
        try {
            subject.login(token);
        } catch (UnknownAccountException uae) {
            resultCode.setErrcode(1);
            resultCode.setErrormsg("账户不存在!");
            message = "账户不存在!";
        } catch (IncorrectCredentialsException ice) {
            resultCode.setErrcode(2);
            resultCode.setErrormsg("密码错误!");
            message = "密码错误!";
        } catch (LockedAccountException lae) {
            resultCode.setErrcode(3);
            resultCode.setErrormsg("账号被锁定!");
            message = "账号被锁定";
        } catch (Exception e) {
            e.printStackTrace();
            resultCode.setErrcode(4);
            resultCode.setErrormsg("未知错误,请联系管理员!");
            message = "未知错误,请联系管理员!";
        }
        if(StringUtils.isEmpty(message)){           //表示登陆成功
            //进行记录操作
            userService.login(user.getEmail(),request);
            resultCode.setErrcode(200);
            resultCode.setErrormsg("登录成功!");
            resultCode.setSuccess(true);           //在这里写日志
        }
        return resultCode;
    }

    /**
     * 用户退出
     * @return
     */
    @RequestMapping(value="logout",method = {RequestMethod.GET})
    public ModelAndView logout(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login");
        return modelAndView;
    }

    /**
     * 注册
     * @return
     */
    @RequestMapping(value = "register",method = {RequestMethod.GET})
    public ModelAndView register(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/register");
        return modelAndView;
    }

    /**
     * 新增用户信息
     * @param request
     * http://localhost:pay-web/user/register
     * @return
     */
    @RequestMapping(value = "register",method={RequestMethod.POST})
    @ResponseBody
    public ResultCode register(User user,HttpServletRequest request){
        ResultCode resultCode = userService.register(user,request);
        return resultCode;
    }

    /**
     * 验证邮箱
     * @param email  待验证的邮箱
     * @return
     */
    @RequestMapping(value = "validateEmail",method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public ResultCode vaidateEmail(String email){
        ResultCode resultCode = userService.validateEmail(email);
        return resultCode;
    }

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
     * 保存重置密码
     * @return
     * http://localhost:pos
     */
    @RequestMapping(value="resetPassword",method ={RequestMethod.POST})
    @ResponseBody
    public ResultCode saveResetPassword(User user,HttpServletRequest request){
        return userService.resetPassword(user,request);
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
