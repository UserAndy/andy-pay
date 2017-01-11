package org.andy.pay.alipay.request;

/**
 * Created by andy on 17-1-10.
 */
public class RoyaltyDetailInfos implements java.io.Serializable{

    /**
     * (可选)分账序列号，表示分账执行的顺序，必须为正整数
     */
    private int serial_no;

    /**
     * (可选)接受分账金额的账户类型： 	userId：支付宝账号对应
     */
    private String trans_in_type;

    /**
     * (必填) 分账批次号 分账批次号。 目前需要和转入账号类型为bankIndex配合使用。
     */
    private String batch_no;
    /**
     * (可选)商户分账的外部关联号
     */
    private String out_relation_id;
    /**
     * (必填)要分账的账户类型
     */
    private String trans_out_type;

    /**
     * (必填)如果转出账号类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
     */
    private String trans_out;

    /**
     *(必填) 如果转入账号类型为userId，本参数为接受分账金额的支付宝账号对应的支付宝唯一用户号。
     */
    private String trans_in;

    /**
     * (必填)分账的金额，单位为元
     */
    private int amount;

    /**
     * (可选)分账描述信息
     */
    private String desc;

    /**
     * (可选)分账的比例，值为20代表按20%的比例分账
     */
    private String amount_percentage;

    public RoyaltyDetailInfos() {
    }

    public int getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(int serial_no) {
        this.serial_no = serial_no;
    }

    public String getTrans_in_type() {
        return trans_in_type;
    }

    public void setTrans_in_type(String trans_in_type) {
        this.trans_in_type = trans_in_type;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public String getOut_relation_id() {
        return out_relation_id;
    }

    public void setOut_relation_id(String out_relation_id) {
        this.out_relation_id = out_relation_id;
    }

    public String getTrans_out_type() {
        return trans_out_type;
    }

    public void setTrans_out_type(String trans_out_type) {
        this.trans_out_type = trans_out_type;
    }

    public String getTrans_out() {
        return trans_out;
    }

    public void setTrans_out(String trans_out) {
        this.trans_out = trans_out;
    }

    public String getTrans_in() {
        return trans_in;
    }

    public void setTrans_in(String trans_in) {
        this.trans_in = trans_in;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAmount_percentage() {
        return amount_percentage;
    }

    public void setAmount_percentage(String amount_percentage) {
        this.amount_percentage = amount_percentage;
    }
}
