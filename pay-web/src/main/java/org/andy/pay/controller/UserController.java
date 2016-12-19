package org.andy.pay.controller;

import org.andy.pay.common.bean.ResultCode;
import org.andy.pay.common.utils.StringUtils;
import org.andy.pay.model.User;
import org.andy.pay.service.LogService;
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

/**
 * description: 用户登录操作
 * Created by andy on 2016/11/8.
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private LogService logService;

    /**
     * 请求登录方法
     * @return
     */
    @RequestMapping(value="/login",method={RequestMethod.GET})
    public String login(Model model){
        return "/user/login";
    }

    /**
     * 用户登录
     * @param
     * @return http://localhost:8080/pay/login
     */
    @RequestMapping(value="/login",method={RequestMethod.POST})
    @ResponseBody
    public ResultCode login(User user, HttpServletRequest request){
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
        modelAndView.setViewName("/user/login");
        return modelAndView;
    }

}
