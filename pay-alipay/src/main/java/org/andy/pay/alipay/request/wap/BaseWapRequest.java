package org.andy.pay.alipay.request.wap;

/**
 * version: 1.0
 * description: 手机网站支付的基础请求参数
 * author: Andy
 * date: 2017/01/22
 */
public class BaseWapRequest implements  java.io.Serializable{

    /**
     * 接口名称, (必填)
     */
    private String service;

    /**
     * 合作者身份 (必填)
     */
    private String partner;

    /**
     * 参数编码字符集 (必填) 仅支持utf-8
     */
    private String _input_charset;

    /**
     * 签名方式 (必填)
     */
    private String sign_type;

    /**
     * 签名 (必填)
     */
    private String sign;

    /**
     * 服务器异步通知页面路径(非必填)
     */
    private String notify_url;



    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String get_input_charset() {
        return _input_charset;
    }

    public void set_input_charset(String _input_charset) {
        this._input_charset = _input_charset;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

}
