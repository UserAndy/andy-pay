import org.andy.pay.alipay.request.TradeWapPayRequest;
import org.andy.pay.alipay.utils.TestOutputUtils;
import org.junit.Test;

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
        tradeWapPay.setApp_id("");
        tradeWapPay.setMethod("alipay.trade.wap.pay");
        tradeWapPay.setFormat("JSON");
        tradeWapPay.setCharset("utf-8");
        tradeWapPay.setSign_type("RSA2");
        tradeWapPay.setSign("sign");
        tradeWapPay.setTimestamp("2017-01-11 12:11:11");
        tradeWapPay.setVersion("1.0");
        tradeWapPay.setApp_auth_token("ttoken"); //调用的接口版本
        tradeWapPay.setBiz_content("biz_content");
        //业务参数
        tradeWapPay.setNotify_url("notify_url");
        tradeWapPay.setBody("内容信息");
        tradeWapPay.setSubject("商品的标题");
        tradeWapPay.setOut_trade_no("20170112001");
        tradeWapPay.setTimeout_express("15d");
        tradeWapPay.setTotal_amount(1);
        tradeWapPay.setSeller_id("seller_id");
        tradeWapPay.setApp_auth_token("token");
        tradeWapPay.setProduct_code("product_code");
        tradeWapPay.setGoods_type("0");  //非必须
        tradeWapPay.setPassback_params("passback_params"); //非必须
        tradeWapPay.setPromo_params("promo"); //非必须
        tradeWapPay.setExtend_params("extends_params"); //非必须
        tradeWapPay.setEnable_pay_channels("chan"); //非必须
        tradeWapPay.setDisable_pay_channels("disable_pay_channels");
        TestOutputUtils.output(tradeWapPay);
    }
}
