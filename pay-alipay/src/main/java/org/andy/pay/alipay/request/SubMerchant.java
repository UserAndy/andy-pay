package org.andy.pay.alipay.request;

/**
 * version: 1.0
 * description: 交易支付 请求api
 * author:andy
 * date: 2017/01/10
 */
public class SubMerchant implements java.io.Serializable{

    /**
     * (可选)二级商户信息,当前只对特殊银行机构特定场景下使用此字段
     */
    private String sub_merchant;

    public String getSub_merchant() {
        return sub_merchant;
    }

    public void setSub_merchant(String sub_merchant) {
        this.sub_merchant = sub_merchant;
    }
}
