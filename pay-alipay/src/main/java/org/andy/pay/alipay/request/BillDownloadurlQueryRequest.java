package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description: 对账下单
 * author:Andy
 * date: 2017/01/10
 */
public class BillDownloadurlQueryRequest extends BaseRequest implements java.io.Serializable{

    /**
     * 必填 (账单类型)
     */
    private String bill_type;

    /**
     * (必填)账单时间 日账单格式为yyyy-MM-dd，月账单格式为yyyy-MM
     */
    private String bill_date;

    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }
}
