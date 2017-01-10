package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description:支付请求公共参数,与BaseRequest请求的信息多了 notifi_url字段
 * author:andy
 * date: 2017/01/10
 */
public class PayBaseRequest extends BaseRequest{

    /**
     * 支付宝服务器主动通知商户服务器里指定的页面http/https路径。(非必须)
     */
    private String notify_url;


    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }
}
