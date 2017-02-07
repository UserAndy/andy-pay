import org.andy.pay.alipay.request.RefundQueryRequest;
import org.andy.pay.alipay.utils.TestOutputUtils;
import org.andy.pay.common.conn.HttpUtils;
import org.junit.Test;

/**
 * version: 1.0
 * description: 退款信息
 * author:Andy
 * date: 2017/01/11
 */
public class TestRefundQuery {

    /**
     * 测试退款查询请求
     */
    @Test
    public void testRefundQueryRequest(){
        RefundQueryRequest refundQuery = new RefundQueryRequest();
        refundQuery.setApp_id("");
        TestOutputUtils.output(refundQuery);
    }

    /**
     * 测试退款查询返回信息
     */
    @Test
    public void testRefundQueryResponse(){

    }
}
