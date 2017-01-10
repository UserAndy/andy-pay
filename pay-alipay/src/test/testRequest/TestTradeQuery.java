import org.andy.pay.alipay.request.TradeQueryRequest;
import org.andy.pay.alipay.respose.TradeFundBill;
import org.andy.pay.alipay.respose.TradeQueryRespose;
import org.andy.pay.alipay.respose.VoucherDetail;
import org.andy.pay.common.utils.JsonUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * version: 1.0
 * description:测试交易请求&返回信息 json数据是否正确
 * author:andy
 * date: 2017/01/10
 */
public class TestTradeQuery {

    /**
     * 测试交易查询请求对象
     */
    @Test
    public void testTradeRequestMethod(){
        TradeQueryRequest  tradeQuery = new TradeQueryRequest();
        tradeQuery.setOut_trade_no("20150320010101001");
        tradeQuery.setTrade_no("2014112611001004680 073956707");
        tradeQuery.setApp_auth_token("token");
        tradeQuery.setApp_id("201402101");
        tradeQuery.setBiz_content("bizcontent");
        tradeQuery.setCharset("utf-8");
        tradeQuery.setFormat("json");
        tradeQuery.setMethod("method");
        tradeQuery.setSign("sign");
        tradeQuery.setSign_type("md5");
        tradeQuery.setTimestamp("2014-12-12 12:11:11");
        tradeQuery.setVersion("1.0");
        System.out.println(JsonUtils.toJsonString(tradeQuery));
    }

    /**
     * 测试交易返回数据的交易查询
     */
    @Test
    public void testTradeResponse(){
        TradeQueryRespose tradeQuery = new TradeQueryRespose();
        tradeQuery.setAlipay_store_id("storeId");
        tradeQuery.setBuyer_logon_id("buyer_logon_id");
        tradeQuery.setBuyer_pay_amount(12.11);
        tradeQuery.setDiscount_goods_detail("goods_detail");
        //
        List<TradeFundBill> list = new ArrayList<TradeFundBill>();
        TradeFundBill bill = new TradeFundBill();
        bill.setAmount(112.1);
        bill.setFund_channel("12.1");
        bill.setReal_amount(11.1);
        list.add(bill);
        tradeQuery.setFund_bill_list(list);
        //
        tradeQuery.setIndustry_sepc_detail("details");
        tradeQuery.setOpen_id("openid");
        tradeQuery.setDiscount_goods_detail("discountGoods");
        tradeQuery.setTotal_amount(12.1);
        tradeQuery.setPoint_amount(12.1);
        //
        List<VoucherDetail> listDetails = new ArrayList<VoucherDetail>();
        VoucherDetail details = new VoucherDetail();
        details.setAmount(12.1);
        details.setId("id");
        details.setMemo("meno");
        details.setMerchant_contribute(12.1);
        details.setName("name");
        details.setOther_contribute(12.1);
        listDetails.add(details);
        //
        tradeQuery.setVoucher_detail_list(listDetails);
        tradeQuery.setSend_pay_date(new Date());
        tradeQuery.setStore_name("strore_name");
        tradeQuery.setTerminal_id("terminal_id");
        tradeQuery.setReceipt_amount("status");
        System.out.println(JsonUtils.toJsonString(tradeQuery));
    }
}
