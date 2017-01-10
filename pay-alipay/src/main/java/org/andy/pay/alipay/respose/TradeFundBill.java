package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description:交易支付使用的资金渠道
 * author:andy
 * date: 2017/01/10
 */
public class TradeFundBill implements java.io.Serializable{

    //交易使用的资金渠道，
    private String fund_channel;

    //(选填)该支付工具类型所使用的金额
    private double amount;

    //(选填)渠道实际付款金额
    private double real_amount;

    public TradeFundBill() {
    }

    public String getFund_channel() {
        return fund_channel;
    }

    public void setFund_channel(String fund_channel) {
        this.fund_channel = fund_channel;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getReal_amount() {
        return real_amount;
    }

    public void setReal_amount(double real_amount) {
        this.real_amount = real_amount;
    }
}
