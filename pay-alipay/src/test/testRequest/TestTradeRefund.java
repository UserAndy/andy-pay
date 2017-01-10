import org.andy.pay.alipay.request.TradeRefundRequest;
import org.andy.pay.alipay.respose.TradeFundBill;
import org.andy.pay.alipay.respose.TradeRefundResponse;
import org.andy.pay.alipay.utils.TestOutputUtils;
import org.andy.pay.common.utils.JsonUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * version: 1.0
 * description:测试交易退款请求&返回信息 json数据是否正确
 * author:andy
 * date: 2017/01/10
 */
public class TestTradeRefund {

    /**
     * 测试交易退款的请求信息
     */
    @Test
    public void testTradeRefundRequest(){
        TradeRefundRequest tradeRefund = new TradeRefundRequest();
        tradeRefund.setVersion("1.0");
        tradeRefund.setTimestamp("timestarmp");
        tradeRefund.setSign_type("md5");
        tradeRefund.setOperator_id("operator_id");
        tradeRefund.setOut_trade_no("trade_no");
        tradeRefund.setRefund_amount(12.11);
        tradeRefund.setStore_id("11.1");
        tradeRefund.setOut_request_no("request_no");
        tradeRefund.setApp_auth_token("token");
        tradeRefund.setBiz_content("bize_content");
        tradeRefund.setVersion("11.11");
        System.out.println(JsonUtils.toJsonString(tradeRefund));
    }

    /**
     * 测试交易退款的请求信息
     */
    @Test
    public void testTradeRefundRespose(){
        TradeRefundResponse tradeRefundResponse = new TradeRefundResponse();
        tradeRefundResponse.setTrade_no("trade_no");
        tradeRefundResponse.setOut_trade_no("out_trade_no");
        tradeRefundResponse.setOpen_id("open_id");
        tradeRefundResponse.setBuyer_logon_id("buyer_logon_id");
        tradeRefundResponse.setFund_change("y");
        tradeRefundResponse.setRefund_fee(12.1);
        tradeRefundResponse.setGmt_refund_pay(new Date());
        tradeRefundResponse.setStore_name("store_name");
        tradeRefundResponse.setBuyer_user_id("user_id");
        //
        List<TradeFundBill> list = new ArrayList<TradeFundBill>();
        TradeFundBill bill = new TradeFundBill();
        bill.setReal_amount(12.1);
        bill.setFund_channel("12.1");
        bill.setAmount(191.1);
        list.add(bill);
        tradeRefundResponse.setRefund_detail_item_list(list);
        TestOutputUtils.output(tradeRefundResponse);
    }
}
