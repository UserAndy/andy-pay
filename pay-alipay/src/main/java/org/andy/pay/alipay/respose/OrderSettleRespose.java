package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description: 统一收单交易结算接口
 * author:Andy
 * date: 2017/01/10
 */
public class OrderSettleRespose extends BaseRespose{

    /**
     * ()支付宝交易号
     */
    private String trade_no;


    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }
}
