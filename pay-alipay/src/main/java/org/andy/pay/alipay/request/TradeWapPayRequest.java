package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description: 对账下单的基本信息
 * author:Andy
 * date: 2017/01/11
 */
public class TradeWapPayRequest extends BaseRequest{

    /**
     * (非必须)通知url 支付宝服务器主动通知商户服务器里指定的页面http/https路径
     */
    private String notify_url;

    /**
     * (非必须)对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
     */
    private String body;

    /**
     * (必须)商品的标题/交易标题/订单标题/订单关键字等
     */
    private String subject;

    /**
     * (必须)商户网站唯一订单号
     */
    private String out_trade_no;

    /**
     * (非必须)该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，
     */
    private String timeout_express;

    /**
     * (必填)订单总金额，单位为元，
     */
    private double total_amount;

    /**
     * (必填)收款支付宝用户ID。
     */
    private String seller_id;

    /**
     * (非必须)针对用户授权接口，获取用户相关数据时，用于标识用户授权关系
     */
    private String auth_token;

    /**
     * (必须)销售产品码，商家和支付宝签约的产品码
     */
    private String product_code;

    /**
     *（非必须）商品主类型：0—虚拟类商品，1—实物类商品
     注：虚拟类商品不支持使用花呗渠道
     */
    private String goods_type;

    /**
     * (非必须)公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝会在异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝
     */
    private String passback_params;

    /**
     * (非必须)优惠参数
     注：仅与支付宝协商后可用
     */
    private String promo_params;

    /**
     * (非必须)业务扩展参数，详见下面的
     */
    private String extend_params;

    /**
     * (非必须) 用户只能在指定渠道范围内支付
     */
    private String enable_pay_channels;

    /**
     * (非必须)禁用渠道，用户不可用指定渠道支付
     当有多个渠道时用“,”分隔
     注：与enable_pay_channels互斥
     */
    private String disable_pay_channels;

    public TradeWapPayRequest() {
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public String getPassback_params() {
        return passback_params;
    }

    public void setPassback_params(String passback_params) {
        this.passback_params = passback_params;
    }

    public String getPromo_params() {
        return promo_params;
    }

    public void setPromo_params(String promo_params) {
        this.promo_params = promo_params;
    }

    public String getExtend_params() {
        return extend_params;
    }

    public void setExtend_params(String extend_params) {
        this.extend_params = extend_params;
    }

    public String getEnable_pay_channels() {
        return enable_pay_channels;
    }

    public void setEnable_pay_channels(String enable_pay_channels) {
        this.enable_pay_channels = enable_pay_channels;
    }

    public String getDisable_pay_channels() {
        return disable_pay_channels;
    }

    public void setDisable_pay_channels(String disable_pay_channels) {
        this.disable_pay_channels = disable_pay_channels;
    }
}
