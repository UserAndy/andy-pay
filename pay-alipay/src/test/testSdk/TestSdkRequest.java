import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;
import org.junit.Test;

import static org.andy.pay.alipay.utils.AlipayConfig.sign_type;

/**
 * Created by andy on 17-2-7.
 */
public class TestSdkRequest {

    /**
     * 测试执行
     */
    @Test
    public void testExcute(){
        try {
            AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", "2016012501118872", "atsph3tqbm8r6l1gkjjirrwsf9la7sjv", "json", "GBK", "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB", "RSA2");
            AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
            request.setBizContent("{\"out_trade_no\":\"20170122000111\",\"trade_no\":\"2017020721001004020214567923\"}");
            AlipayTradeQueryResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                System.out.println("调用成功");
            } else {
                System.out.println("调用失败");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
