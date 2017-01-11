package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description: 关闭返回信息
 * author:Andy
 * date: 2017/01/11
 */
public class TradeCloseResponse extends BaseRespose implements java.io.Serializable{

    /**
     * (必填)支付宝交易号
     */
    private String trade_no;

    /**
     * (必填)创建交易传入的商户订单号
     */
    private String out_trade_no;

    public TradeCloseResponse() {
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }
}
