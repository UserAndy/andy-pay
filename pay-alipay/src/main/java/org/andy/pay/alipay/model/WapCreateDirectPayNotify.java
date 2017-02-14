package org.andy.pay.alipay.model;

import org.andy.pay.alipay.respose.wap.WapCreateDirectPayNotifyResponse;

/**
 * version: 1.0
 * description: 手机异步支付的基本信息
 * author: Andy
 * date: 2017/01/22
 */
public class WapCreateDirectPayNotify extends WapCreateDirectPayNotifyResponse{

    /**
     * 主键
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
