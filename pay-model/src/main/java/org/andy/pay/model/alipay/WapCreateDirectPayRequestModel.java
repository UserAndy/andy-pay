package org.andy.pay.model.alipay;

import org.andy.pay.alipay.request.wap.WapCreateDirectPayRequest;

/**
 * version: 1.0
 * description: 手机直接支付的请求参数表
 * author: Andy
 * date: 2017/02/06
 */
public class WapCreateDirectPayRequestModel extends WapCreateDirectPayRequest implements java.io.Serializable{

    /**
     * 表主键
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
