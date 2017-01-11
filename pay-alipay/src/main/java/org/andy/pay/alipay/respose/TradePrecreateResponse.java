package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description: 预付款的返回对象
 * author:andy
 * date: 2017/01/11
 */
public class TradePrecreateResponse extends BaseRespose{

    /**
     * (必须)商户订单号
     */
    private String out_trade_no;

    /**
     *(必须)当前预下单请求生成的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码
     */
    private String qr_code;

    public TradePrecreateResponse() {
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }
}
