package org.andy.pay.alipay.respose.wap;

import java.util.Date;

/**
 * version: 1.0
 * description: 手机网站支付 Wap Response的返回的基础参数
 * author: Andy
 * date: 2017/01/22
 */
public class WapCreateDirectPayNotifyResponse extends BaseWapResponse{

    /**
     * 商户网站唯一订单号 (非必填)
     */
    private String out_trade_no;

    /**
     * (非必填)
     * 商品名称 (商品的标题/交易标题/订单标题/订单关键字等。)
     */
    private String subject;

    /**
     * 支付类型 (非必填)
     * (对应请求时的payment_type参数，原样返回)
     */
    private String payment_type;

    /**
     * 支付宝交易号 (非必填)
     * (该交易在支付宝系统中的交易流水号。最长64位。)
     */
    private String trade_no;

    /**
     * 支付状态(非必填)
     */
    private String trade_status;

    /**
     * 该笔交易创建的时间。 (非必填)
     * 格式为yyyy-MM-dd HH:mm:ss。
     */
    private Date gmt_create;

    /**
     * 该笔交易的买家付款时间。(非必填)
     * 格式为yyyy-MM-dd HH:mm:ss。
     */
    private Date gmt_payment;

    /**
     * 交易关闭时间 (非必填)
     */
    private Date gmt_close;

    /**
     * 卖家支付宝账号 (非必填)
     * (卖家支付宝账号，可以是email和手机号码。)
     */
    private String seller_email;

    /**
     * 买家支付宝帐号 (非必填)
     * 家支付宝账号，可以是Email或手机号码。
     */
    private String buyer_email;

    /**
     * 卖家支付宝账户号 (非必填)
     * (卖家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。)
     */
    private String seller_id;

    /**
     * 买家支付宝账户号 (非必填)
     * 买家支付宝账号对应的支付宝唯一用户号。
     * 以2088开头的纯16位数字。
     */
    private String buyer_id;

    /**
     * 商品单价  (非必填)
     * (如果请求时使用的是total_fee，那么price等于total_fee；如果请求时传了price，那么对应请求时的price参数，原样通知回来。)
     */
    private double price;

    /**
     * 该订单的总金额  (非必填)
     */
    private double total_fee;

    /**
     * 购买数量   (非必填)
     * 如果请求时使用的是total_fee，那么quantity等于1；如果请求时有传quantity，那么对应请求时的quantity参数，原样通知回来。
     */
    private int quantity;

    /**
     * 商品描述 (非必填)
     */
    private String body;

    /**
     * 折扣 (非必填)
     */
    private int discount;

    /**
     * 是否调整总价 (非必填)
     */
    private String is_total_fee_adjust;

    /**
     * 是否使用红包买家 (非必填)
     */
    private String use_coupon;

    /**
     * 退款状态
     */
    private String refund_status;

    /**
     * 退款时间
     * 卖家退款的时间，退款通知时会发送。
     * 格式为yyyy-MM-dd HH:mm:ss。
     */
    private Date gmt_refund;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
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

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getTrade_status() {
        return trade_status;
    }

    public void setTrade_status(String trade_status) {
        this.trade_status = trade_status;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_payment() {
        return gmt_payment;
    }

    public void setGmt_payment(Date gmt_payment) {
        this.gmt_payment = gmt_payment;
    }

    public Date getGmt_close() {
        return gmt_close;
    }

    public void setGmt_close(Date gmt_close) {
        this.gmt_close = gmt_close;
    }

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    public String getBuyer_email() {
        return buyer_email;
    }

    public void setBuyer_email(String buyer_email) {
        this.buyer_email = buyer_email;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(double total_fee) {
        this.total_fee = total_fee;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getIs_total_fee_adjust() {
        return is_total_fee_adjust;
    }

    public void setIs_total_fee_adjust(String is_total_fee_adjust) {
        this.is_total_fee_adjust = is_total_fee_adjust;
    }

    public String getUse_coupon() {
        return use_coupon;
    }

    public void setUse_coupon(String use_coupon) {
        this.use_coupon = use_coupon;
    }

    public String getRefund_status() {
        return refund_status;
    }

    public void setRefund_status(String refund_status) {
        this.refund_status = refund_status;
    }

    public Date getGmt_refund() {
        return gmt_refund;
    }

    public void setGmt_refund(Date gmt_refund) {
        this.gmt_refund = gmt_refund;
    }
}
