package org.andy.pay.common.utils;

/**
 * 字符串工具类 用来判断是否为空
 * Created by andy on 16-12-1.
 */
public class StringUtils {

    /**
     * 判断是否为空(带改进)
     * @param content
     * @return  true　表示为空　　false　表示不为空
     */
    public static boolean isEmpty(String content){
        return (content == null||"".equals(content))?true:false;
    }

}
