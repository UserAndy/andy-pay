package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description:创建订单的基本信息
 * author:andy
 * date: 2017/01/10
 */
public class TradeCreateResponse extends BaseRespose{

    /**
     * 商户订单号(必填)
     */
    private String out_trade_no;

    /**
     * 支付宝交易号(必填)
     */
    private String trade_no;

    public TradeCreateResponse() {
    }

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
