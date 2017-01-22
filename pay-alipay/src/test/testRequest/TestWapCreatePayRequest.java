import org.andy.pay.alipay.request.wap.WapCreateDirectPayRequest;
import org.andy.pay.alipay.utils.AlipaySubmit;
import org.andy.pay.alipay.utils.ConvertUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * version: 1.0
 * description: 测试手机网站支付请求
 * author:Andy
 * date: 2017/01/12
 */
public class TestWapCreatePayRequest {


    /**
     * 测试支付信息
     */
    @Test
    public void testPay(){
      WapCreateDirectPayRequest request = new WapCreateDirectPayRequest();
        request.set_input_charset("UTF-8");
        request.setService("alipay.wap.create.direct.pay.by.user");
        request.setPartner("2088021440106798");
        request.setSign_type("RSA");
        //
        request.setNotify_url("http://www.baidu.com/notify_url");
        request.setReturn_url("http://www.baidu.com/return_url");
        request.setOut_trade_no("201701220001");
        request.setSubject("商品标题");
        request.setTotal_fee("0.01");
        request.setSeller_id("2088021440106798");
        request.setPayment_type("1");
        request.setShow_url("http://www.baidu.com");
        request.setBody("商品详情");
        request.setIt_b_pay("15d");

        Map<String,String> params = ConvertUtils.toMapObject(request);

        //
        String path = AlipaySubmit.buildRequest(params);
        System.out.println(path);

    }

    /**
     * 测试信息
     */
    @Test
    public void testGrpup(){

    }
}
