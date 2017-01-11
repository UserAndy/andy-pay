package org.andy.pay.alipay.respose;

/**
 * version: 1.0
 * description: 对账下单的基本信息
 * author:Andy
 * date: 2017/01/11
 */
public class BillDownloadurlQueryResponse extends BaseRespose implements java.io.Serializable{

    /**
     * (必填) 账单下载地址链接，获取连接后30秒后未下载，链接地址失效。
     */
    private String bill_download_url;

    public String getBill_download_url() {
        return bill_download_url;
    }

    public void setBill_download_url(String bill_download_url) {
        this.bill_download_url = bill_download_url;
    }
}
