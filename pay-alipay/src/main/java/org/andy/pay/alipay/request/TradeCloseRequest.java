package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description: 关闭交易
 * author:Andy
 * date: 2017/01/11
 */
public class TradeCloseRequest extends BaseRequest{

    /**
     * 通知url(非必须)
     */
    private String notify_url;

    /**
     * (特殊可选) 该交易在支付宝系统中的交易流水号。
     */
    private String trade_no;

    /**
     *(特殊可选)订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_trade_no如果同时存在优先取trade_no
     */
    private String out_trade_no;
    /**
     * (可选)卖家端自定义的的操作员 ID
     */
    private String operator_id;

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
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

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }
}
