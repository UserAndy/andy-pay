package org.andy.pay;

import org.andy.pay.exceptions.OrderNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * description: 测试异常controller
 *
 * @author: andy
 * Created by 2016/11/17 1:10
 */
@Controller
@RequestMapping("/exception1")
public class TestExceptionController {

    /**
     * 测试异常
     * http://localhost:8080/pay/exception1/testexcption
     */
    @RequestMapping(value="/testexcption",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView testException(){
        ModelAndView modelAndView = new ModelAndView();
        Object obj = null;
        if(obj==null)throw new OrderNotFoundException();
        modelAndView.addObject("message","object");
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
