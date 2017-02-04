import org.andy.pay.alipay.request.TradeWapPayRequest;
import org.andy.pay.alipay.utils.AlipayConfig;
import org.andy.pay.alipay.utils.AlipaySubmit;
import org.andy.pay.common.utils.ConvertMapUtils;
import org.junit.Test;

import java.util.Map;

/**
 * version: 1.0
 * description: 测试手机Wap Pay
 * author:Andy
 * date: 2017/01/12
 */
public class TestTradeWapPayRequest {

    /**
     * 测试手机网站请求
     */
    @Test
    public void testTradeWapPayRequest(){
        TradeWapPayRequest tradeWapPay = new TradeWapPayRequest();
        //公共请求参数
        tradeWapPay.setApp_id(AlipayConfig.seller_id);
        tradeWapPay.setMethod("alipay.trade.wap.pay");
        tradeWapPay.setFormat("JSON");
        tradeWapPay.setCharset("utf-8");
        tradeWapPay.setSign_type("RSA2");
        tradeWapPay.setTimestamp("2017-01-11 12:11:11");
        tradeWapPay.setVersion("1.0");
        tradeWapPay.setApp_auth_token("ttoken"); //调用的接口版本
        tradeWapPay.setBiz_content("biz_content");
        tradeWapPay.setReturn_url("http://www.baidu.com/notify_url");

        //业务参数
        tradeWapPay.setNotify_url("http://www.baidu.com/notify_url");
        tradeWapPay.setBody("内容信息");
        tradeWapPay.setSubject("商品的标题");
        tradeWapPay.setOut_trade_no("2017011200111");
        tradeWapPay.setTimeout_express("15d");
        tradeWapPay.setTotal_amount(1);
        tradeWapPay.setSeller_id(AlipayConfig.seller_id);
        tradeWapPay.setApp_auth_token("token");
        tradeWapPay.setProduct_code("product_code");
/*        tradeWapPay.setGoods_type("0");  //非必须
        tradeWapPay.setPassback_params("passback_params"); //非必须
        tradeWapPay.setPromo_params("promo"); //非必须
        tradeWapPay.setExtend_params("extends_params"); //非必须
        tradeWapPay.setEnable_pay_channels("chan"); //非必须
        tradeWapPay.setDisable_pay_channels("disable_pay_channels");*/

        Map<String,String> params = ConvertMapUtils.toMapObject(tradeWapPay);
        String path = AlipaySubmit.buildRequest(params);
        System.out.println(path);
    }
}
