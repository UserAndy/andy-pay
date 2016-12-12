package org.andy.pay.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;

/**
 * json工具类基于 fastjson
 * Created by andy on 16-11-29.
 */
public class JsonUtils {


    /**
     * 将java对象转换为json格式的字符串
     * @param object  带转换的对象
     * @return	json格式的字符串
     */
    public static String toJsonString(Object object){
        return JSONObject.toJSONString(object);
    }

    /**
     * 默认日期
     * @param object
     * @return
     */
    public static String toJsonWithDefaultDateFormatString(Object object){
        return toJsonWithDateString(object,"yyyy-MM-DD hh:mm:ss");
    }

    /**
     * 带有日期格式的json格式字符串转换
     * @param object
     * @param format
     * @return
     */
    public static String toJsonWithDateString(Object object,String format){
        return JSONObject.toJSONStringWithDateFormat(object,format, SerializerFeature.PrettyFormat);
    }

    /**
     * 将对象转换为json格式字符串(包括子类的,与toJsonString具体区别可以参考自定义菜单)
     * @param object
     * @return
     */
    public static String toJSONAndChildStr(Object object){
        return JSONObject.toJSON(object).toString();
    }

    /**
     * 将json格式的数据转换为java对象(不包括数组,集合类型)
     * @param <T>
     * @param jsonData	json格式的字符串
     * @param t			待转换成的java对象
     * @return
     */
    public static <T> T jsonToJavaObject(String jsonData,Class<T> t){
        return JSONObject.parseObject(jsonData, t);
    }

    /**
     * 将json格式的数据转换为java集合对象 ,List集合,map集合
     * @param jsonData	待转换的json格式的字符串
     * @param t			泛型集合对象
     * @return
     */
    public static <T> List<T> jsonToJavaList(String jsonData, Class<T> t){
        return JSONObject.parseArray(jsonData, t);
    }
}
