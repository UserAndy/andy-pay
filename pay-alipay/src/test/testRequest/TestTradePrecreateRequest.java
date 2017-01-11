import org.andy.pay.alipay.request.TradePrecreateRequest;
import org.andy.pay.alipay.respose.TradePrecreateResponse;
import org.andy.pay.alipay.utils.TestOutputUtils;
import org.junit.Test;

/**
 * version: 1.0
 * description:测试预付款
 * author:andy
 * date: 2017/01/10
 */
public class TestTradePrecreateRequest{

    /**
     * 测试预付款请求参数
     */
    @Test
    public void testTradePrecreate(){
        TradePrecreateRequest tradePrecreate = new TradePrecreateRequest();
        TestOutputUtils.output(tradePrecreate);
    }

    /**
     * 测试预付款返回参数
     */
    @Test
    public void testTradePrecreateResponse(){
        TradePrecreateResponse tradePrecreate = new TradePrecreateResponse();
        TestOutputUtils.output(tradePrecreate);
    }
}
