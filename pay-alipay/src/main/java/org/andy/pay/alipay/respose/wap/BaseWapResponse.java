package org.andy.pay.alipay.respose.wap;

import java.util.Date;

/**
 * version: 1.0
 * description: 手机网站支付 Wap Response的返回的基础参数
 * author: Andy
 * date: 2017/01/22
 */
public class BaseWapResponse implements java.io.Serializable{

    /**
     * 成功标识 (必填)
     * 表示接口调用是否成功,并不表明业务处理结果
     */
    private String is_success;

    /**
     * 签名方式 (必填)
     *  DSA、RSA、MD5三个值可选，必须大写。
     */
    private String sign_type;

    /**
     * 签名 (必填)
     */
    private String sign;

    /**
     * 标志调用哪个记哦口返回的链接 (非必填)
     */
    private String service;

    /**
     * 通知校验id (非必填)
     * 支付宝通知校验ID，商户可以用这个流水号询问支付宝该条通知的合法性。
     */
    private String notify_id;

    /**
     * 通知时间 （支付宝时间） (非必填)
     * 格式为yyyy-MM-dd HH:mm:ss。
     */
    private Date notify_time;

    /**
     * 返回通知类型。 (非必填)
     *
     */
    private String notify_type;

    public BaseWapResponse() {
    }

    public String getIs_success() {
        return is_success;
    }

    public void setIs_success(String is_success) {
        this.is_success = is_success;
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

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getNotify_id() {
        return notify_id;
    }

    public void setNotify_id(String notify_id) {
        this.notify_id = notify_id;
    }

    public Date getNotify_time() {
        return notify_time;
    }

    public void setNotify_time(Date notify_time) {
        this.notify_time = notify_time;
    }

    public String getNotify_type() {
        return notify_type;
    }

    public void setNotify_type(String notify_type) {
        this.notify_type = notify_type;
    }
}
