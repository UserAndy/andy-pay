package org.andy.pay.alipay.respose;

import java.util.Date;
import java.util.List;

/**
 * 交易支付回复信息
 */
public class TradePayResponse extends BaseRespose{

    /**
     * (必填)支付宝交易号
     */
    private String trade_no;

    /**
     * (必填) 商家交易号
     */
    private String out_trade_no;

    /**
     * (必填)买家支付宝账号
     */
    private String buyer_logon_id;

    /**
     * (必填)交易金额
     */
    private double total_amount;

    /**
     * (必填)实收金额
     */
    private double receipt_amount;

    /**
     * (选填)买家付款的金额
     */
    private double buyer_pay_amount;

    /**
     * (选填)交易中可给用户开具发票的金额
     */
    private double invoice_amount;

    /**
     * (必填)交易支付时间
     */
    private Date gmt_payment;

    /**
     * (必填)交易支付使用的资金渠道
     */
    private List<TradeFundBill> fund_bill_list;

    /**
     * (选填)支付宝卡余额
     */
    private double card_balance;

    /**
     * (必填)买家在支付宝的用户id
     */
    private double buyer_user_id;

    /**
     * (选填) 本次交易支付所使用的单品券优惠的商品优惠信息
     */
    private String discount_goods_detail;

    /**
     * (选填)本交易支付时使用的所有优惠券信息
     */
    private List<VoucherDetail> list;

    public TradePayResponse() {
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

    public String getBuyer_logon_id() {
        return buyer_logon_id;
    }

    public void setBuyer_logon_id(String buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
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

    public double getBuyer_pay_amount() {
        return buyer_pay_amount;
    }

    public void setBuyer_pay_amount(double buyer_pay_amount) {
        this.buyer_pay_amount = buyer_pay_amount;
    }

    public double getInvoice_amount() {
        return invoice_amount;
    }

    public void setInvoice_amount(double invoice_amount) {
        this.invoice_amount = invoice_amount;
    }

    public Date getGmt_payment() {
        return gmt_payment;
    }

    public void setGmt_payment(Date gmt_payment) {
        this.gmt_payment = gmt_payment;
    }

    public List<TradeFundBill> getFund_bill_list() {
        return fund_bill_list;
    }

    public void setFund_bill_list(List<TradeFundBill> fund_bill_list) {
        this.fund_bill_list = fund_bill_list;
    }

    public double getCard_balance() {
        return card_balance;
    }

    public void setCard_balance(double card_balance) {
        this.card_balance = card_balance;
    }

    public double getBuyer_user_id() {
        return buyer_user_id;
    }

    public void setBuyer_user_id(double buyer_user_id) {
        this.buyer_user_id = buyer_user_id;
    }

    public String getDiscount_goods_detail() {
        return discount_goods_detail;
    }

    public void setDiscount_goods_detail(String discount_goods_detail) {
        this.discount_goods_detail = discount_goods_detail;
    }

    public List<VoucherDetail> getList() {
        return list;
    }

    public void setList(List<VoucherDetail> list) {
        this.list = list;
    }
}
