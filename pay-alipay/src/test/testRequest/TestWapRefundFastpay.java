import org.andy.pay.alipay.request.wap.WapRefundFastpayRequest;
import org.andy.pay.alipay.utils.AlipayHttpUtils;
import org.andy.pay.alipay.utils.AlipaySubmit;
import org.andy.pay.common.conn.HttpUtils;
import org.andy.pay.common.utils.ConvertMapUtils;
import org.junit.Test;

import java.util.Map;

/**
 * version: 1.0
 * description:测试手机wap退款的基本信息
 * author:Andy
 * date: 2017/01/12
 * (待测试)
 */
public class TestWapRefundFastpay {

    /**
     * 即时到账有密退款接口
     */
    @Test
    public void testWapRefundFastPay(){
        WapRefundFastpayRequest request = new WapRefundFastpayRequest();
        request.setService("refund_fastpay_by_platform_pwd");
        request.setPartner("2088021440106798");
        request.set_input_charset("utf-8");
        request.setSign_type("RSA2");
        request.setSign("");
        request.setNotify_url("http://www.enjoykeys.com/paytest/alipay/refundNotify");
        request.setSeller_email("2088021440106798");
        request.setSeller_user_id("2088021440106798");
        request.setRefund_date("2017-02-06 12:11:11");
        request.setBatch_no("201702070001");
        request.setBatch_num("1");
        request.setDetail_data("2017020721001004020214567923^0.01^测试退款");
        Map<String,String> params = ConvertMapUtils.toMapObject(request);
        params = AlipaySubmit.buildRequestPara(params);
        String result = AlipayHttpUtils.HttpDefaultExecute(params,"");
        System.out.println("result--->"+result);
    }
}
