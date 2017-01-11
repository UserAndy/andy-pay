package org.andy.pay.alipay.enums;

/**
 * version: 1.0
 * description: 交易渠道 (待完善,需要写在db中进行)
 * author:Andy
 * date: 2017/01/11
 */
public enum TradeChannel{

    COUPON("支付宝红包"),

    ALIPAYACCOUNT("支付宝余额"),

    POINT("集分宝"),

    DISCOUNT("折扣券"),

    PCARD("预付卡"),

    FINANCEACCOUNT("余额宝"),

    MCARD("商家储值卡"),

    MDISCOUNT("商户优惠券"),

    MCOUPON("商户红包"),

    PCREDIT("蚂蚁花呗");

    private String name;

    TradeChannel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}