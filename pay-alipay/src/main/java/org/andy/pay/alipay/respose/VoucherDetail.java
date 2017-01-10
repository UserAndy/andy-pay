package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description:优惠卷信息
 * author:andy
 * date: 2017/01/10
 */
public class VoucherDetail implements java.io.Serializable{
    //券id(必填)
    private String id;

    //券名称(必填)
    private String name;

    //(必填)优惠券面额，它应该会等于商家出资加上其他出资方出资
    private double amount;

    //(选填)商家出资（特指发起交易的商家出资金额
    private double merchant_contribute;

    //(选填)其他出资方出资金额，可能是支付宝，可能是品牌商，
    private double other_contribute;

    //(选填)优惠券备注信息
    private String memo;

    public VoucherDetail() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getMerchant_contribute() {
        return merchant_contribute;
    }

    public void setMerchant_contribute(double merchant_contribute) {
        this.merchant_contribute = merchant_contribute;
    }

    public double getOther_contribute() {
        return other_contribute;
    }

    public void setOther_contribute(double other_contribute) {
        this.other_contribute = other_contribute;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
