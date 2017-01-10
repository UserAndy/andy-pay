package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description: 公共返回信息
 * author:andy
 * date: 2017/01/10
 */
public class BaseRespose implements java.io.Serializable{

    //网管返回码(必须)
    private String code;

    //网关返回码描述(必须)
    private String msg;

    //业务返回码(非必须)
    private String sub_code;

    //业务返回码描述(非必须)
    private String sub_msg;

    //签名(必须)
    private String sign;

    public BaseRespose() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSub_code() {
        return sub_code;
    }

    public void setSub_code(String sub_code) {
        this.sub_code = sub_code;
    }

    public String getSub_msg() {
        return sub_msg;
    }

    public void setSub_msg(String sub_msg) {
        this.sub_msg = sub_msg;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
