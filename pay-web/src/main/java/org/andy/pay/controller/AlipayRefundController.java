package org.andy.pay.controller;

import org.andy.pay.common.utils.ConvertMapUtils;
import org.andy.pay.common.utils.OutputUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * description: 支付宝支付退款接口
 * Created 2017-02-07
 * @author Andy
 */
@Controller
@RequestMapping("alipay")
public class AlipayRefundController {

    /**
     * 退款通知接口的参数接口
     * @param request
     * http://localhost:8080/paytest/alipay/refundNotify
     */
    @RequestMapping(value = "refundNotify",method = {RequestMethod.GET,RequestMethod.POST})
    public void refundNotify(HttpServletRequest request){
        Map<String,String> params = ConvertMapUtils.convertMapToStr(request.getParameterMap());
        System.out.println("refundNotify--->");
        OutputUtils.output(params);
    }
}
