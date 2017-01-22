package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description:支付请求公共参数
 * author:andy
 * date: 2017/01/10
 */
public class BaseRequest implements java.io.Serializable{

    //应用ID (必须)
    private String app_id;

    //接口名称 (必须)
    private String method;

    //格式,目前只支持json (非必须)
    private String format;

    //编码 utf-8,gbk gb2312(必须)
    private String charset;

    //签名算法类型(必须)  商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
    private String sign_type;

    //商户请求参数的签名串(必须)
    private String sign;

    //发送的时间 格式"yyyy-MM-dd HH:mm:ss" (必须)
    private String timestamp;

    //调用的接口版本, 固定为1.0 (必须)
    private String version;

    //(非必须)
    private String app_auth_token;

    // (必须)请求参数的集合,除公共参数外所有请求参数读必须放在该参数中传递
    private String biz_content;

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApp_auth_token() {
        return app_auth_token;
    }

    public void setApp_auth_token(String app_auth_token) {
        this.app_auth_token = app_auth_token;
    }

    public String getBiz_content() {
        return biz_content;
    }

    public void setBiz_content(String biz_content) {
        this.biz_content = biz_content;
    }
}
