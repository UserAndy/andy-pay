package org.andy.pay.alipay.utils;


import org.andy.pay.alipay.request.BaseRequest;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * version: 1.0
 * description: 转换工具类,将对象转换为map集合
 * author:Andy
 * date: 2017/01/12
 */
public class ConvertUtils {

    /**
     * 将类转换为Map<String,Object>对象, 类的属性名为key值, 属性值为value,去掉key为空的
     * @param
     * @return
     */
    public static Map<String,String> toMapObject(Object object){
        Map<String,String> result = null;
        if(object!=null){
            result = new HashMap<String,String>();
            Field[] array = object.getClass().getDeclaredFields();
            try {
                if (array != null) {
                    for (Field field : array) {
                        field.setAccessible(true);
                        String name = field.getName();
                        if(name!=null&&!"".equals(name)) {
                            Object obj = field.get(object);
                            if(obj!=null&&!"".equals(obj)) {
                                result.put(name,String.valueOf(obj));
                            }
                        }
                    }
                }
            }catch (IllegalAccessException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }
/*
        public static void main(String[] args){
            BaseRequest request = new BaseRequest();
            request.setBiz_content("bize_content");
            request.setVersion("1.0");
            request.setApp_auth_token("token");
            request.setTimestamp("timestarmp");
            request.setApp_id("app_id");
            request.setCharset("utf-8");
            Map<String,Object> params = toMapObject(request);
            for(Map.Entry<String, Object> item: params.entrySet()){
                System.out.println(item.getKey()+":"+item.getValue());

        }
    }*/
}
