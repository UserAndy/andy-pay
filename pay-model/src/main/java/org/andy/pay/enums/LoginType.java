package org.andy.pay.enums;

/**
 * @description:
 * @author: Andy
 * @date: 2017-03-01
 * @blog: www.andyqian.com
 */
public enum LoginType {

    /**
     * pc端
     */
    PC(1,"PC端"),

    /**
     * 微信端
     */
    WECHAT(2,"微信端"),

    /**
     * andorid端
     */
    ANDROID(3,"android客户端"),

    /**
     * ios端
     */
    IOS(4,"ios客户端");

   private int code;

    private String message;

    LoginType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
