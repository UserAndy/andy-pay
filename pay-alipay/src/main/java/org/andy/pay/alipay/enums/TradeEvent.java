package org.andy.pay.alipay.enums;

/**
 * version: 1.0
 * description: 交易触发状态
 * author:Andy
 * date: 2017/01/11
 */
public enum TradeEvent{

    /**
     * 交易完成 （不触发通知）
     */
    TRADE_FINISHED(false),

    /**
     * 支付成功 （触发通知）
     */
    TRADE_SUCCESS(true),

    /**
     * 交易创建 （不触发通知）
     */
    WAIT_BUYER_PAY(false),

    /**
     * 交易关闭 触发通知）
     */
    TRADE_CLOSED(true);

    private boolean state;

   TradeEvent(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
