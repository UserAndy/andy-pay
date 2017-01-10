package org.andy.pay.alipay.utils;

import org.andy.pay.common.utils.JsonUtils;

/**
 * Created by andy on 17-1-10.
 */
public class TestOutputUtils {

    /**
     * 输出信息
     * @param obj
     */
    public static void output(Object obj){
        System.out.println(JsonUtils.toJsonString(obj));
    }
}
