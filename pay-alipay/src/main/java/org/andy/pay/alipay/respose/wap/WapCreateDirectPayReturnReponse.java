package org.andy.pay.alipay.respose.wap;

/**
 * version: 1.0
 * description: 手机网站支付 Wap 返回的参数
 * author: Andy
 * date: 2017/01/22
 */
public class WapCreateDirectPayReturnReponse extends BaseWapResponse implements java.io.Serializable{

    /**
     * 商户网站唯一订单号    (非必填)
     * (对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
      需保证在商户网站中的唯一性。是请求时对应的参数，原样返回。)
     */
    private String out_trade_no;

    /**
     * 支付宝交易号 (非必填)
     */
    private String trade_no;

    /**
     * 商品名称 (非必填)
     * (商品的标题/交易标题/订单标题/订单关键字等。)
     */
    private String subject;

    /**
     * 支付类型(非必填)
     * (对应请求时的payment_type参数，原样返回。)
     */
    private String payment_type;

    /**
     * 交易状态
     * (交易目前所处的状态。

     成功状态的值只有两个：

     TRADE_FINISHED（普通即时到账的交易成功状态）
     TRADE_SUCCESS（开通了高级即时到账或机票分销产品后的交易成功状态）)
     */
    private String trade_status;

    /**
     * 卖家支付宝帐号 (非必填)
     * 卖家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
     */
    private String seller_id;

    /**
     * 非必填
     * 交易金额  单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
     */
    private double total_fee;

    /**
     * 商品描述 对一笔交易的具体描述信息。请求参数原样返回。
     */
    private String body;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getTrade_status() {
        return trade_status;
    }

    public void setTrade_status(String trade_status) {
        this.trade_status = trade_status;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public double getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(double total_fee) {
        this.total_fee = total_fee;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
