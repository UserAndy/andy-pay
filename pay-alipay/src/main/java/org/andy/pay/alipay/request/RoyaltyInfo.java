package org.andy.pay.alipay.request;

import java.util.List;

/**
 * version: 1.0
 * description: 描述分账信息，Json格式，其它说明详见分账说明
 * author:andy
 * date: 2017/01/10
 */
public class RoyaltyInfo implements java.io.Serializable{

    /**
     * (可选)分账类型 卖家的分账类型
     */
    private String royalty_type;

    /**
     * (必填)分账明细的信息，可以描述多条分账指令，json数组
     */
    private List<RoyaltyDetailInfos> royalty_detail_infos;

    public String getRoyalty_type() {
        return royalty_type;
    }

    public void setRoyalty_type(String royalty_type) {
        this.royalty_type = royalty_type;
    }

    public List<RoyaltyDetailInfos> getRoyalty_detail_infos() {
        return royalty_detail_infos;
    }

    public void setRoyalty_detail_infos(List<RoyaltyDetailInfos> royalty_detail_infos) {
        this.royalty_detail_infos = royalty_detail_infos;
    }
}
