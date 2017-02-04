package org.andy.pay.controller;


import org.andy.pay.common.utils.ConvertMapUtils;
import org.andy.pay.common.utils.OutputUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Set;

/**
 * description: 支付宝controller类的基本情况
 * @version 1.0
 * @author Andy
 * @date 2017-01-04
 */
@Controller
@RequestMapping("alipay")
public class AlipayController extends BasicController{

    /**
     * 通知方法
     * @param request   请求信息
     * http://localhost:8080/pay-web/alipay/notifyUrl
     */
    @RequestMapping("/notifyUrl")
    public void notifyMethod(HttpServletRequest request,HttpServletResponse response){
        Map<String,String> params = ConvertMapUtils.convertMapToStr(request.getParameterMap());
        System.out.println("notifyUrl--->");
        OutputUtils.output(params);
    }

    /**
     * 同步返回的url方法
     * 访问url: http://localhost:8080/pay-web/alipay/returnUrl
     */
    @RequestMapping("/returnUrl")
    public void returnUrlMethod(HttpServletRequest request,HttpServletResponse response){
        Map<String,String> params = ConvertMapUtils.convertMapToStr(request.getParameterMap());
        System.out.println("returnUrl--->");
        OutputUtils.output(params);
    }
}
