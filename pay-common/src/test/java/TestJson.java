import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * 测试json
 */
public class TestJson {

    /**
     * 测试json
     */
    @Test
    public void test(){
        TestName name = new TestName();
        name.setOut_trade_no("20170122000111");
        name.setTrade_no("2017020721001004020214567923");
        String value = JSONObject.toJSONString(name);
        System.out.println(value);
    }


    class TestName{
        private String out_trade_no;
        private String trade_no;

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getTrade_no() {
            return trade_no;
        }

        public void setTrade_no(String trade_no) {
            this.trade_no = trade_no;
        }
    }
}
