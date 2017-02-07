import org.andy.pay.common.conn.HttpUtils;
import org.junit.Test;

/**
 * Created by andy on 17-2-7.
 */
public class TestConnection {

    /**
     * 支付请求信息
     */
    @Test
    public void testRequest(){
        String result = HttpUtils.HttpDefaultExecute("GET","http://www.baidu.com",null,"");
        System.out.println(result);
    }
}
