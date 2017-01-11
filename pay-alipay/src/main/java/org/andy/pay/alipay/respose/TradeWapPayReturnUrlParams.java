package org.andy.pay.alipay.respose;

import org.andy.pay.alipay.request.BaseRequest;

/**
 * version: 1.0
 * description: wap端前台回跳参数
 * author:Andy
 * date: 2017/01/11
 */
public class TradeWapPayReturnUrlParams extends BaseRequest implements  java.io.Serializable{

    /**
     * (必须)商户网站唯一订单号
     */
    private String out_trade_no;

    /**
     * 该交易在支付宝系统中的交易流水号。最长64位。
     */
    private String trade_no;

    /**
     * 总金额 该笔订单的资金总额，单位为RMB-Yuan
     */
    private double total_amount;

    /**
     * 收款支付宝账号对应的支付宝唯一用户号。 以2088开头的纯16位数字
     */
    private String seller_id;

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

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }
}
