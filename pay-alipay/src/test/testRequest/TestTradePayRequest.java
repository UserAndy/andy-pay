import org.andy.pay.alipay.request.TradePayRequest;
import org.andy.pay.alipay.respose.TradePayResponse;
import org.andy.pay.alipay.utils.TestOutputUtils;
import org.junit.Test;

/**
 * version: 1.0
 * description: 业务扩展参数
 * author:andy
 * date: 2017/01/11
 */
public class TestTradePayRequest{

    /**
     * 测试支付请求
     */
    @Test
    public void testTradePayRequest(){
        TradePayRequest tradePayRequest = new TradePayRequest();
        TestOutputUtils.output(tradePayRequest);
    }

    /**
     * 测试支付中返回的基本信息
     */
    @Test
    public void testTradePayResponse(){
        TradePayResponse tradePayResponse = new TradePayResponse();
        TestOutputUtils.output(tradePayResponse);
    }
}
