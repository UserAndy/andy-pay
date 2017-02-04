package org.andy.pay.common.utils;

import java.util.Map;

/**
 * 测试工具类
 */
public class OutputUtils{

    /**
     * output 信息
     * @param params
     */
    public static void output(Map<String,String> params){
        for (Map.Entry<String, String> item : params.entrySet()) {
            System.out.println("key--->" + item.getKey() + "   name-->" + item.getValue());
        }
    }
}
