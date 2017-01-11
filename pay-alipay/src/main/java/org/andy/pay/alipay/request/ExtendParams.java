package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description: 业务扩展参数
 * author:andy
 * date: 2017/01/10
 */
public class ExtendParams implements java.io.Serializable{
    /**
     * (可选)系统商编号 该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
     */
    private String sys_service_provider_id;

    /**
     * (可选) 使用花呗分期要进行的分期数
     */
    private String hb_fq_num;

    /**
     * (可选) 使用花呗分期需要卖家承担的手续费比例的百分值，传入100代表100%
     */
    private String hb_fq_seller_percent;

    public ExtendParams() {
    }

    public String getSys_service_provider_id() {
        return sys_service_provider_id;
    }

    public void setSys_service_provider_id(String sys_service_provider_id) {
        this.sys_service_provider_id = sys_service_provider_id;
    }

    public String getHb_fq_num() {
        return hb_fq_num;
    }

    public void setHb_fq_num(String hb_fq_num) {
        this.hb_fq_num = hb_fq_num;
    }

    public String getHb_fq_seller_percent() {
        return hb_fq_seller_percent;
    }

    public void setHb_fq_seller_percent(String hb_fq_seller_percent) {
        this.hb_fq_seller_percent = hb_fq_seller_percent;
    }
}


