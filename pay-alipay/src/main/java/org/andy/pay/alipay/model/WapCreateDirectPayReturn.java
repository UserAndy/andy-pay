package org.andy.pay.alipay.model;

import org.andy.pay.alipay.respose.wap.WapCreateDirectPayReturnReponse;

/**
 * version: 1.0
 * description: wap 创建直接支付
 * author: Andy
 * date: 2017/01/22
 */
public class WapCreateDirectPayReturn extends WapCreateDirectPayReturnReponse{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
