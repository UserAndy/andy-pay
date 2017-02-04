import org.andy.pay.alipay.request.wap.WapCreateDirectPayRequest;
import org.andy.pay.alipay.utils.AlipaySubmit;
import org.andy.pay.common.utils.ConvertMapUtils;
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
     * 测试通过Map集合参数Pay
     * (测试成功)
     */
    @Test
    public void testMapPay(){
        //
        Map<String,String> sParaTemp = new HashMap<String,String>();
        sParaTemp.put("service","alipay.wap.create.direct.pay.by.user");
        sParaTemp.put("partner","2088021440106798");
        sParaTemp.put("seller_id","2088021440106798");
        sParaTemp.put("_input_charset","utf-8");
        sParaTemp.put("payment_type","1");
        sParaTemp.put("out_trade_no","2017010400001");
        sParaTemp.put("subject","大乐透");
        sParaTemp.put("total_fee","0.01");
        sParaTemp.put("show_url","http://www.taobao.com/product/113714.html");
        sParaTemp.put("body","商品描述");
        sParaTemp.put("notify_url","http://localhost:8080/pay-web/alipay/notifyUrl");
        sParaTemp.put("return_url","http://localhost:8080/pay-web/alipay/returnUrl");
        sParaTemp.put("sign","");
        sParaTemp.put("sign_type","RSA");
        sParaTemp.put("it_b_pay","15d");
        String path = AlipaySubmit.buildRequest(sParaTemp);
        System.out.println("支付url:"+path);
    }

    /**
     * 测试支付信息
     * (测试成功)
     */
    @Test
    public void testPay(){
      WapCreateDirectPayRequest request = new WapCreateDirectPayRequest();
        request.set_input_charset("utf-8");
        request.setService("alipay.wap.create.direct.pay.by.user");
        request.setPartner("2088021440106798");
        request.setSign_type("RSA");
        //
        request.setNotify_url("http://localhost:8080/pay-web/alipay/notifyUrl");
        request.setReturn_url("http://localhost:8080/pay-web/alipay/returnUrl");
        request.setOut_trade_no("20170122000111");
        request.setSubject("商品标题");
        request.setTotal_fee("0.01");
        request.setSeller_id("2088021440106798");
        request.setPayment_type("1");
        request.setShow_url("http://www.baidu.com");
        request.setBody("商品详情");
        request.setIt_b_pay("15d");
        Map<String,String> params = ConvertMapUtils.toMapObject(request);
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
