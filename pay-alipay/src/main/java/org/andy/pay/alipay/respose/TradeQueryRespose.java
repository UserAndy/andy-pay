package org.andy.pay.alipay.respose;

import java.util.Date;
import java.util.List;

/**
 * version: 1.0
 * description:交易查询
 * author:andy
 * date: 2017/01/10
 */
public class TradeQueryRespose implements java.io.Serializable{

    //支付宝交易号(必填)
    private String trade_no;

    //商家订单号(必填)
    private String out_trade_no;

    //买家支付宝用户号，该字段将废弃，不要使用(选填)
    private String open_id;

    //买家支付宝账号(必填)
    private String buyer_logon_id;

    //交易状态(必填) 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
    private String trade_status;

    //交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount(必填)
    private double total_amount;

    //实收金额(实收金额，单位为元，两位小数。)(必填)
    private String receipt_amount;

    //买家实付金额()  (选填) 买家实付金额，单位为元，两位小数
    private double buyer_pay_amount;

    //(选填)积分支付金额() 积分支付的金额，单位为元，两位小数。该金额代表该笔交易中用户使用积分支付的金额，比如集分宝或者支付宝实时优惠等
    private double point_amount;

    //(选填)交易中用户支付的可开具发票的金额，单位为元，两位小数
    private double invoice_amount;
    //(必填)本次交易打款给卖家的时间
    private Date send_pay_date;

    //支付宝店铺编号(选填)
    private String alipay_store_id;

    //商户门店编号(选填)
    private String store_id;

    //商户机具终端编号(选填)
    private String terminal_id;

    //(选填)交易支付使用的资金渠道
    private List<TradeFundBill> fund_bill_list;

    //(选填)请求交易支付中的商户店铺的名称
    private String store_name;

    //(必填)买家在支付宝的用户id
    private String buyer_user_id;

    //(必填)本次交易支付所使用的单品券优惠的商品优惠信息
    private String discount_goods_detail;

    //(选填)行业特殊信息
    private String industry_sepc_detail;

    //(选填)本交易支付时使用的所有优惠券信息
    private List<VoucherDetail> voucher_detail_list;

    public TradeQueryRespose() {
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

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getBuyer_logon_id() {
        return buyer_logon_id;
    }

    public void setBuyer_logon_id(String buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
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

    public String getReceipt_amount() {
        return receipt_amount;
    }

    public void setReceipt_amount(String receipt_amount) {
        this.receipt_amount = receipt_amount;
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

    public double getInvoice_amount() {
        return invoice_amount;
    }

    public void setInvoice_amount(double invoice_amount) {
        this.invoice_amount = invoice_amount;
    }

    public Date getSend_pay_date() {
        return send_pay_date;
    }

    public void setSend_pay_date(Date send_pay_date) {
        this.send_pay_date = send_pay_date;
    }

    public String getAlipay_store_id() {
        return alipay_store_id;
    }

    public void setAlipay_store_id(String alipay_store_id) {
        this.alipay_store_id = alipay_store_id;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getTerminal_id() {
        return terminal_id;
    }

    public void setTerminal_id(String terminal_id) {
        this.terminal_id = terminal_id;
    }


    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getBuyer_user_id() {
        return buyer_user_id;
    }

    public void setBuyer_user_id(String buyer_user_id) {
        this.buyer_user_id = buyer_user_id;
    }

    public String getDiscount_goods_detail() {
        return discount_goods_detail;
    }

    public void setDiscount_goods_detail(String discount_goods_detail) {
        this.discount_goods_detail = discount_goods_detail;
    }
    public String getIndustry_sepc_detail() {
        return industry_sepc_detail;
    }

    public void setIndustry_sepc_detail(String industry_sepc_detail) {
        this.industry_sepc_detail = industry_sepc_detail;
    }

    public List<TradeFundBill> getFund_bill_list() {
        return fund_bill_list;
    }

    public void setFund_bill_list(List<TradeFundBill> fund_bill_list) {
        this.fund_bill_list = fund_bill_list;
    }

    public List<VoucherDetail> getVoucher_detail_list() {
        return voucher_detail_list;
    }

    public void setVoucher_detail_list(List<VoucherDetail> voucher_detail_list) {
        this.voucher_detail_list = voucher_detail_list;
    }
}
