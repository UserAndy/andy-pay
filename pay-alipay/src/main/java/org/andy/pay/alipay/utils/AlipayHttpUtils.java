package org.andy.pay.alipay.utils;

import org.andy.pay.common.conn.HttpUtils;

import java.util.Map;

/**
 * description: 支付包请求工具类
 * @author  Andy
 */
public class AlipayHttpUtils {

    /**
     * 请求网管
     */
    private static final String URL="https://mapi.alipay.com/gateway.do";

    /**
     * 请求方法
     */
    private static final String REQUEST_METHOD="POST";

    /**
     *
     * @param params
     * @param requestData
     * @return
     */
    public static String HttpDefaultExecute(Map<String,String> params, String requestData){
        return HttpUtils.HttpDefaultExecute(REQUEST_METHOD,URL,params,requestData);
    }
}
