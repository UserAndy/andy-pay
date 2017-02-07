package org.andy.pay.alipay.request.wap;

/**
 * version: 1.0
 * description: 即时到账有密退款接口 请求参数
 * author: Andy
 * date: 2017/02/07
 */
public class WapRefundFastpayRequest extends BaseWapRequest{

    /**
     * 麦家支付宝帐号 (不可为空)
     */
    private String seller_email;

    /**
     * 卖家用户Id (不可为空)
     */
    private String seller_user_id;

    /**
     * 退款请求时间 (不可为空)
     */
    private String refund_date;

    /**
     * 退款批次号 (不可为空)
     */
    private String batch_no;

    /**
     * 总比数 (不可为空)
     */
    private String batch_num;

    /**
     *  单笔数据集
     */
    private String detail_data;

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    public String getSeller_user_id() {
        return seller_user_id;
    }

    public void setSeller_user_id(String seller_user_id) {
        this.seller_user_id = seller_user_id;
    }

    public String getRefund_date() {
        return refund_date;
    }

    public void setRefund_date(String refund_date) {
        this.refund_date = refund_date;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public String getBatch_num() {
        return batch_num;
    }

    public void setBatch_num(String batch_num) {
        this.batch_num = batch_num;
    }

    public String getDetail_data() {
        return detail_data;
    }

    public void setDetail_data(String detail_data) {
        this.detail_data = detail_data;
    }
}
