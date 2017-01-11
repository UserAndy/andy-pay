package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description: 描述分账信息，Json格式，其它说明详见分账说明
 * author:Andy
 * date: 2017/01/10
 */
public class RefundQueryRequest extends BaseRequest{

    /**
     * (特殊可选) 支付宝交易号，和商户订单号不能同时为空
     */
    private String trade_no;

    /**
     * (特殊可选)订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_trade_no如果同时存在优先取trade_no
     */
    private String out_trade_no;

    /**
     * (必填)请求退款接口时，传入的退款请求号，如果在退款请求时未传入，则该值为创建交易时的外部交易号
     */
    private String out_request_no;

    public RefundQueryRequest() {
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

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
    }
}
