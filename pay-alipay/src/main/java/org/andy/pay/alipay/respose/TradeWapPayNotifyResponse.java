package org.andy.pay.alipay.respose;

import java.util.Date;

/**
 * version: 1.0
 * description:wap端异步通知参数结果
 * author:andy
 * date: 2017/01/11
 */
public class TradeWapPayNotifyResponse implements java.io.Serializable{

    /**
     * (必须)通知时间
     */
    private Date notify_time;

    /**
     * (必须)通知类型
     */
    private String notify_type;

    /**
     * (必须)通知校验id
     */
    private String notify_id;

    /**
     * (必须)支付宝分配给开发者的应用Id
     */
    private String app_id;

    /**
     * (必须)编码格式
     */
    private String charset;

    /**
     * (必须)调用的接口版本
     */
    private String version;

    /**
     * (必须)商户的签名类型
     */
    private String sign_type;

    /**
     * (必须)签名
     */
    private String sign;

    /**
     * (必须)支付宝交易号
     */
    private String trade_no;

    /**
     *  (非必须) 商户订单号
     */
    private String out_trade_no;

    /**
     *  (非必须) 商户业务号
     */
    private String out_biz_no;

    /**
     *  (非必须) 买家支付宝用户号
     */
    private String buyer_id;

    /**
     * (非必须) 买家支付宝账号
     */
    private String buyer_logon_id;

    /**
     * (非必须) 卖家支付宝用户号
     */
    private String seller_id;

    /**
     *(非必须) 卖家支付宝账号
     */
    private String seller_email;

    /**
     * (非必须)交易状态
     */
    private String trade_status;

    /**
     * (非必须)订单总金额
     */
    private double total_amount;

    /**
     * (非必须)实收金额
     */
    private double receipt_amount;

    /**
     * (非必须) 开票金额
     */
    private double invoice_amount;

    /**
     * (非必须) 付款金额
     */
    private double buyer_pay_amount;

    /**
     * (非必须)  集分宝金额
     */
    private double point_amount;

    /**
     * (非必须) 总退款金额
     */
    private double refund_fee;

    /**
     * (非必须) 订单标题
     */
    private String subject;

    /**
     * (非必须) 商品描述
     */
    private String body;

    /**
     * (非必须) 交易创建时间
     */
    private Date gmt_create;

    /**
     * (非必须) 交易付款时间
     */
    private Date gmt_payment;

    /**
     * (非必须) 交易退款时间
     */
    private Date gmt_refund;

    /**
     * (非必须)交易结束时间
     */
    private Date  gmt_close;

    /**
     * (非必须)支付金额信息
     */
    private String fund_bill_list;

    /**
     * (非必须) 回传参数
     */
    private String passback_params;

    /**
     * (非必须) 优惠券信息
     */
    private String voucher_detail_list;

    public TradeWapPayNotifyResponse() {
    }

    public Date getNotify_time() {
        return notify_time;
    }

    public void setNotify_time(Date notify_time) {
        this.notify_time = notify_time;
    }

    public String getNotify_type() {
        return notify_type;
    }

    public void setNotify_type(String notify_type) {
        this.notify_type = notify_type;
    }

    public String getNotify_id() {
        return notify_id;
    }

    public void setNotify_id(String notify_id) {
        this.notify_id = notify_id;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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

    public String getOut_biz_no() {
        return out_biz_no;
    }

    public void setOut_biz_no(String out_biz_no) {
        this.out_biz_no = out_biz_no;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getBuyer_logon_id() {
        return buyer_logon_id;
    }

    public void setBuyer_logon_id(String buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    public String getTrade_status() {
        return trade_status;
    }

    public void setTrade_status(String trade_status) {
        this.trade_status = trade_status;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public double getReceipt_amount() {
        return receipt_amount;
    }

    public void setReceipt_amount(double receipt_amount) {
        this.receipt_amount = receipt_amount;
    }

    public double getInvoice_amount() {
        return invoice_amount;
    }

    public void setInvoice_amount(double invoice_amount) {
        this.invoice_amount = invoice_amount;
    }

    public double getBuyer_pay_amount() {
        return buyer_pay_amount;
    }

    public void setBuyer_pay_amount(double buyer_pay_amount) {
        this.buyer_pay_amount = buyer_pay_amount;
    }

    public double getPoint_amount() {
        return point_amount;
    }

    public void setPoint_amount(double point_amount) {
        this.point_amount = point_amount;
    }

    public double getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(double refund_fee) {
        this.refund_fee = refund_fee;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    public Date getGmt_refund() {
        return gmt_refund;
    }

    public void setGmt_refund(Date gmt_refund) {
        this.gmt_refund = gmt_refund;
    }

    public Date getGmt_close() {
        return gmt_close;
    }

    public void setGmt_close(Date gmt_close) {
        this.gmt_close = gmt_close;
    }

    public String getFund_bill_list() {
        return fund_bill_list;
    }

    public void setFund_bill_list(String fund_bill_list) {
        this.fund_bill_list = fund_bill_list;
    }

    public String getPassback_params() {
        return passback_params;
    }

    public void setPassback_params(String passback_params) {
        this.passback_params = passback_params;
    }

    public String getVoucher_detail_list() {
        return voucher_detail_list;
    }

    public void setVoucher_detail_list(String voucher_detail_list) {
        this.voucher_detail_list = voucher_detail_list;
    }
}
