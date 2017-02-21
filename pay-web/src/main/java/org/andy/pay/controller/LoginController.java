package org.andy.pay.controller;

import org.andy.pay.common.bean.ResultCode;
import org.andy.pay.common.utils.StringUtils;
import org.andy.pay.constants.UserContant;
import org.andy.pay.model.User;
import org.andy.pay.service.LogService;
import org.andy.pay.service.impl.UserInfoServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * description: 用户登录操作
 * Created by andy on 2016/11/8.
 * 测试帐号: 940753574@qq.com
 * 密码: 123456
 */
@RequestMapping("/login")
@Controller
public class LoginController {

    @Autowired
    private LogService logService;

    /**
     * 用户基本信息注册
     */
    @Autowired
    private UserInfoServiceImpl userInfoService;

    /**
     * 登录请求方法
     * @return
     */
    @RequestMapping(value="/login",method={RequestMethod.GET})
    public String login(Model model){
        return "/index/login";
    }

    /**
     * 注册请求方法
     * @return
     */
    @RequestMapping(value="/register",method={RequestMethod.GET})
    public String register(Model model){
        return "/index/register";
    }

    /**
     * 用户登录
     * @param
     * @return http://localhost:8080/pay-web/login
     */
    @RequestMapping(value="/login",method={RequestMethod.POST})
    @ResponseBody
    public ResultCode login(User user, HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        ResultCode resultCode = new ResultCode();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
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
            User sessionUser = userInfoService.findByUsername(user.getUsername());
            httpSession.setAttribute(UserContant.SESSION_USER,sessionUser);
        } catch (UnknownAccountException uae) {
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
            resultCode.setErrcode(0);
            resultCode.setErrormsg("登录成功!");
            resultCode.setSuccess(true);           //在这里写日志
        }
        return resultCode;
    }
    /**
     * 用户退出
     * @return
     */
    @RequestMapping(value="/logout",method={RequestMethod.GET})
    public ModelAndView logout(){
        ModelAndView modelAndView = new ModelAndView();
        SecurityUtils.getSubject().logout();
        modelAndView.setViewName("/index/login");
        return modelAndView;
    }

    /**
     * 注册方法
     * @return
     */
    @RequestMapping(value = "/register",method = {RequestMethod.POST})
    @ResponseBody
    public ResultCode register(User user,HttpServletRequest request){
        ResultCode resultCode = userInfoService.register(user,request);
        return resultCode;
    }

    /**
     * 系统首页的信息
     * @return
     */
    @RequestMapping(value = "/index",method = {RequestMethod.GET})
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index/index");
        return modelAndView;
    }

}
