package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description:
 * author:Andy
 * date: 2017/01/11
 */
public class OpenApiRoyaltyDetailInfoPojo implements java.io.Serializable{

    /**
     *  (可选)分账支出方账户，类型为userId，
     */
    private String trans_out;

    /**
     * (可选) trans_in
     */
    private String trans_in;

    /**
     * (可选)分账的金额，单位为元
     */
    private int amount;

    /**
     * (可选)  分账信息中分账百分比。取值范围为大于0，少于或等于100的整数。
     */
    private int amount_percentage;

    /**
     * (可选)分账描述
     */
    private String desc;

    /**
     * (可选) operator_id
     */
    private String operator_id;


}
