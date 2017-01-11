package org.andy.pay.alipay.request;

import org.andy.pay.alipay.respose.BaseRespose;

import java.util.List;

/**
 * version: 1.0
 * description: 交易支付 请求api
 * author:andy
 * date: 2017/01/10
 */
public class TradePayRequest extends BaseRequest{

    /**
     * (可选)支付宝服务器主动通知商户服务器里指定的页面http/https路径。
     */
    private String notify_url;

    /**
     * (必须)商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
     */
    private String out_trade_no;

    /**
     * (必须)支付场景 条码支付，取值：bar_code 声波支付，取值：wave_code
     */
    private String scene;

    /**
     * 授权码 (必须)
     */
    private String auth_code;

    /**
     * 订单标题(必须)
     */
    private String subject;

    /**
     * (可选)如果该值为空，则默认为商户签约账号对应的支付宝用户ID
     */
    private String seller_id;

    /**
     * 订单总金额，单位为元，精确到小数点后两位，(必须)
     */
    private double total_amount;

    /**
     * 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 如果该值未传入，但传入了【订单总金额】和【不可打折金额】，则该值默认为【订单总金额】-【
     * (可选)
     */
    private double discountable_amount;

    /**
     * 不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。如果该值未传入，但传入了【订单总金额】和【可打折金额】，则该值默认为【订单总金额】
     */
    private double undiscountable_amount;

    /**
     * 订单描述
     */
    private String body;

    /**
     * (可选)订单包含的商品列表信息
     */
    private List<GoodsDetail> goods_detail;

    /**
     * (可选)商户操作员编号
     */
    private String operator_id;

    /**
     * (可选)商户门店编号
     */
    private String store_id;

    /**
     * (可选) 商户机具终端编号
     */
    private String terminal_id;

    /**
     * (可选)支付宝的店铺编号
     */
    private String alipay_store_id;

    /**
     * (可选)预授权号，预授权转交易请求中传入
     */
    private String auth_no;

    /**
     * (可选)该笔订单允许的最晚付款时间，逾期将关闭交易。
     */
    private String timeout_express;
    /**
     * (可选)业务扩展参数
     */
    private ExtendParams extend_params;

    /**
     * (可选)描述分账信息，Json格式，其它说明详见分账说明
     */
    private RoyaltyInfo royalty_info;

    public TradePayRequest() {
    }

    /**
     * 二级商户信息,当前只对特殊银行机构特定场景下使用此字段
     */
    private SubMerchant sub_merchant;

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public double getDiscountable_amount() {
        return discountable_amount;
    }

    public void setDiscountable_amount(double discountable_amount) {
        this.discountable_amount = discountable_amount;
    }

    public double getUndiscountable_amount() {
        return undiscountable_amount;
    }

    public void setUndiscountable_amount(double undiscountable_amount) {
        this.undiscountable_amount = undiscountable_amount;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<GoodsDetail> getGoods_detail() {
        return goods_detail;
    }

    public void setGoods_detail(List<GoodsDetail> goods_detail) {
        this.goods_detail = goods_detail;
    }

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
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

    public String getAlipay_store_id() {
        return alipay_store_id;
    }

    public void setAlipay_store_id(String alipay_store_id) {
        this.alipay_store_id = alipay_store_id;
    }

    public String getAuth_no() {
        return auth_no;
    }

    public void setAuth_no(String auth_no) {
        this.auth_no = auth_no;
    }

    public String getTimeout_express() {
        return timeout_express;
    }

    public void setTimeout_express(String timeout_express) {
        this.timeout_express = timeout_express;
    }

    public ExtendParams getExtend_params() {
        return extend_params;
    }

    public void setExtend_params(ExtendParams extend_params) {
        this.extend_params = extend_params;
    }

    public RoyaltyInfo getRoyalty_info() {
        return royalty_info;
    }

    public void setRoyalty_info(RoyaltyInfo royalty_info) {
        this.royalty_info = royalty_info;
    }

    public SubMerchant getSub_merchant() {
        return sub_merchant;
    }

    public void setSub_merchant(SubMerchant sub_merchant) {
        this.sub_merchant = sub_merchant;
    }
}
