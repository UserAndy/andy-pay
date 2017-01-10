package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description:交易查询请求对象
 * author:andy
 * date: 2017/01/10
 */
public class TradeQueryRequest extends BaseRequest {

    //订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_trade_no如果同时存在优先取trade_no (特殊可选)
    private String out_trade_no;

    //交易号(特殊可选)
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
