package org.andy.pay.enums;

/**
 * 订单状态枚举
 * Created by andy on 2016/11/15.
 */
public enum LoginType {

    API(1,"api"),WEB(2,"web"),WECHAT(3,"微信");

    LoginType(int status, String descrption) {
        this.status = status;
        this.descrption = descrption;
    }

    private int status;
    private String descrption;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
}
