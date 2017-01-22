package org.andy.pay.alipay.enums;

/**
 * version: 1.0
 * description: 支付渠道,应用场景:手机网站支付等
 * author: Andy
 * date: 2017/01/22
 */
public enum PayChannel {

    /**
     * 余额支付
     */
    BALANCE("balance"),

    /**
     * 红包
     */
    COUPON("coupon"),

    /**
     * 花呗
     */
    PCREDIT("pcredit"),

    /**
     * 花呗分期
     */
    PCREDITPAYINSTALLMENT("pcreditpayInstallment"),

    /**
     * 信用卡
     */
    CREDITCARD("creditCard"),


    /**
     * 信用卡快捷
     */
    CREDITCARDEXPRESS("creditCardExpress"),

    /**
     * 信用卡卡通
     */
    CREDITCARDCARTOON("creditCardCartoon"),

    /**
     * 信用卡支付方式 信用支付类型（包含信用卡卡通、信用卡快捷、花呗、花呗分期）
     */
    CREDIT_GROUP("credit_group"),

    /**
     * 借记卡快捷
     */
    DEBITCARDEXPRESS("debitCardExpress"),

    /**
     * 商户预存卡
     */
    MCARD("mcard"),

    /**
     * 个人预存卡
     */
    PCARD("pcard"),

    /**
     * 优惠（包含实时优惠+商户优惠）
     */
    PROMOTION("promotion"),
    /**
     * 余额宝
     */
    MONEYFUND("moneyFund");


    PayChannel(String content) {
        this.content = content;
    }

    /**
     * 支付方式
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
