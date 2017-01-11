package org.andy.pay.alipay.request;

import java.util.List;

/**
 * version: 1.0
 * description: 统一收单交易结算接口
 * author:andy
 * date: 2017/01/11
 */
public class OrderSettleRequest extends BaseRequest implements  java.io.Serializable{

    /**
     * (必须)结算请求流水号 开发者自行生成并保证唯一性
     */
   private String out_request_no;

    /**
     * (必须)支付宝订单号
     */
    private String trade_no;

    /**
     * (可选)操作员id
     */
    private String operator_id;

    /**
     * (必须)分账明细信息
     */
    private List<OpenApiRoyaltyDetailInfoPojo> royalty_parameters;

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }

    public List<OpenApiRoyaltyDetailInfoPojo> getRoyalty_parameters() {
        return royalty_parameters;
    }

    public void setRoyalty_parameters(List<OpenApiRoyaltyDetailInfoPojo> royalty_parameters) {
        this.royalty_parameters = royalty_parameters;
    }
}


