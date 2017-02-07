package org.andy.pay.alipay.errorcode;

/**
 * version: 1.0
 * description: 即时到账有密退款接口 errorCode 返回的集合
 * author: Andy
 * date: 2017/01/22
 */
public enum WapRefundBusinessCode {

    ILLEGAL_USER("用户ID不正确"),

    BATCH_NUM_EXCEED_LIMIT("总比数大于1000"),

    REFUND_DATE_ERROR("错误的退款时间"),

    BATCH_NUM_ERROR("传入的总笔数格式错误"),

    BATCH_NUM_NOT_EQUAL_TOTAL("传入的退款条数不等于数据集解析出的退款条数"),

    SINGLE_DETAIL_DATA_EXCEED_LIMIT("单笔退款明细超出限制"),

    NOT_THIS_SELLER_TRADE("不是当前卖家的交易"),

    DUBL_TRADE_NO_IN_SAME_BATCH("同一批退款中存在两条相同的退款记录"),

    DUPLICATE_BATCH_NO("重复的批次号"),

    TRADE_STATUS_ERROR("交易状态不允许退款"),

    BATCH_NO_FORMAT_ERROR("批次号格式错误"),

    SELLER_INFO_NOT_EXIST("卖家信息不存在"),

    PARTNER_NOT_SIGN_PROTOCOL("平台商未签署协议"),

    NOT_THIS_PARTNERS_TRADE("退款明细非本合作伙伴的交易"),

    DETAIL_DATA_FORMAT_ERROR("数据集参数格式错误"),

    PWD_REFUND_NOT_ALLOW_ROYALTY("有密接口不允许退分润"),

    NANHANG_REFUND_CHARGE_AMOUNT_ERROR("退票面价金额不合法"),

    REFUND_AMOUNT_NOT_VALID("退款金额不合法"),

    TRADE_PRODUCT_TYPE_NOT_ALLOW_REFUND("交易类型不允许退交易"),

    RESULT_FACE_AMOUNT_NOT_VALID("退款票面价不能大于支付票面价"),

    REFUND_CHARGE_FEE_ERROR("退收费金额不合法"),

    REASON_REFUND_CHARGE_ERR("退收费失败"),

    RESULT_AMOUNT_NOT_VALID("退收费金额错误"),

    RESULT_ACCOUNT_NO_NOT_VALID("账号无效"),

    REASON_TRADE_REFUND_FEE_ERR("退款金额错误"),

    REASON_HAS_REFUND_FEE_NOT_MATCH("已退款金额错误"),

    TXN_RESULT_ACCOUNT_STATUS_NOT_VALID("账户状态无效"),

    TXN_RESULT_ACCOUNT_BALANCE_NOT_ENOUGH("账户余额不足"),

    REASON_REFUND_AMOUNT_LESS_THAN_COUPON_FEE("红包无法部分退款"),

    BUYER_ERROR("因买家支付宝账户问题不允许退款");


    WapRefundBusinessCode(String message) {
        this.message = message;
    }

    /**
     * 对应的消息
     */
    private String message;

    public String getMessage() {
        return message;
    }

}
