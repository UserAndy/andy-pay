package org.andy.pay.alipay.request.wap;

/**
 * version: 1.0
 * description: 手机网站支付的请求参数
 * author: Andy
 * date: 2017/01/22
 */
public class WapCreateDirectPayRequest extends BaseWapRequest implements java.io.Serializable{

    /**
     * 商户网站唯一订单号 (必填)
     */
    private String out_trade_no;

    /**
     * 商品名称 (必填)
     */
    private String subject;

    /**
     * 交易金额 (必填)
     */
    private String total_fee;

    /**
     * 卖家支付宝用户号(必填)
     */
    private String seller_id;

    /**
     * 支付类型(必填)
     */
    private String payment_type;

    /**
     * 商品展示网址(必填)
     */
    private String show_url;

    /**
     * 商品描述(非必填)
     */
    private String body;

    /**
     * 超时时间(非必填)取值范围：1m～15d。

     m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。

     该参数数值不接受小数点，如1.5h，可转换为90m。

     当用户输入支付密码、点击确认付款后（即创建支付宝交易后）开始计时。

     支持绝对超时时间，格式为yyyy-MM-dd HH:mm。
     */
    private String it_b_pay;

    /**
     * 钱包token (非必填)
     */
    private String extern_token;

    /**
     * 航旅订单其它费用,(非必填)
     * 航旅订单中除去票面价之外的费用，
     * 单位为RMB-Yuan。
     * 取值范围为[0.01,100000000.00]，精确到小数点后两位。
     */
    private double otherfee;

    /**
     * 航旅订单金额 (非必填)
     */
    private String airticket;

    /**
     * 是否发起实名校验 (非必填)
     *   T：发起实名校验；
         F：不发起实名校验。
     */
    private String rn_check;

    /**
     * 买家证件号  (非必填)
     * 买家证件号码（需要与支付宝实名认证时所填写的证件号码一致）。
     * description: 当scene=ZJCZTJF的情况下，才会校验buyer_cert_no字段。
     */
    private String buyer_cert_no;

    /**
     * 买家真实姓名  (非必填)
     *
     * 当scene=ZJCZTJF的情况下，才会校验buyer_real_name字段。
     */
    private String buyer_real_name;

    /**
     * 收单场景 (非必填)
     * 收单场景。如需使用该字段，需向支付宝申请开通，否则传入无效。
     */
    private String scene;

    /**
     * 花呗分期参数 Json格式。 (非必填)
     *
     * description:
     * hb_fq_num：花呗分期数，比如分3期支付；
       hb_fq_seller_percent：卖家承担收费比例，比如100代表卖家承担100%。
        两个参数必须一起传入。
       具体花呗分期期数和卖家承担收费比例可传入的数值请咨询支付宝。
     */
    private String hb_fq_param;

    /**
     * 商品类型  (非必填)
     * 1：实物类商品
       0：虚拟类商品
     */
    private String goods_type;

    /**
     * 是否使用支付宝客户端支付  (非必填)
     *
     * description:
     * app_pay=Y：尝试唤起支付宝客户端进行支付，
     * 若用户未安装支付宝，
     * 则继续使用wap收银台进行支付。商户若为APP，
     * 则需在APP的webview中增加alipays协议处理逻辑。
     */
    private String app_pay;

    /**
     * 商户优惠活动参数 (非必须)
     * 商户与支付宝约定的营销参数，为Key:Value键值对，如需使用，请联系支付宝技术人员。
     */
    private String promo_params;

    /**
     * 可用渠道,用户只能在指定渠道范围内支付
     * 当有多个渠道时,用","分隔
     */
    private String enable_paymethod;

}
