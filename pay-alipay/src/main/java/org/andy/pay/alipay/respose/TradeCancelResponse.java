package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description: 取消交易信息
 * author:andy
 * date: 2017/01/10
 */
public class TradeCancelResponse extends BaseRespose{
    /**
     * (必填)支付宝交易号
     */
  private String trade_no;

    /**
     * (必填)商户订单号
     */
    private String out_trade_no;

    /**
     * (必填)是否需要重试 Y/N
     */
    private String retry_flag;

    /**
     * (必填)本次撤销触发的交易动作 close：关闭交易，无退款 refund：产生了退款	close

     */
    private String action;

    public TradeCancelResponse() {
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

    public String getRetry_flag() {
        return retry_flag;
    }

    public void setRetry_flag(String retry_flag) {
        this.retry_flag = retry_flag;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
