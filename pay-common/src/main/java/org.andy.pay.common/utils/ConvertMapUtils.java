package org.andy.pay.common.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * version: 1.0
 * description: 转换工具类,将对象转换为map集合,将map转换为字符串的工具类
 * author:Andy
 * date: 2017/01/12
 */
public class ConvertMapUtils {

    /**
     * 将类转换为Map<String,Object>对象, 类的属性名为key值, 属性值为value,去掉key为空的
     * @param
     * @return
     */
    public static Map<String,String> toMapObject(Object object){
        Map<String,String> result = null;
        if(object!=null){
            try {
            result = new HashMap<String,String>();
            Class<?> objectClass = object.getClass();
            Field[] array = groupField(objectClass.getDeclaredFields(),objectClass.getSuperclass().getDeclaredFields());
                if (array != null) {
                    for (Field field : array) {
                        if(field!=null) {
                            field.setAccessible(true);
                            String name = field.getName();
                            if (name != null && !"".equals(name)) {
                                Object obj = field.get(object);
                                if (obj != null && !"".equals(obj)) {
                                    result.put(name, String.valueOf(obj));
                                }
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

    /**
     * 子父类
     * @param chirldFiled
     * @param superFiled
     * @return
     */
    private static Field[] groupField(Field[] chirldFiled,Field[] superFiled){
        int chirldLength = chirldFiled.length>0?chirldFiled.length:0;
        int superLenth = superFiled.length>0?superFiled.length:0;
        //
        Field[] fields =new Field[chirldLength+superLenth];
        //子类的chifld
        if(chirldFiled!=null&&chirldFiled.length>0){
            for(int i=0;i<chirldFiled.length;i++){
                fields[i] = chirldFiled[i];
            }
        }
        //父类
        if(superFiled!=null&&superFiled.length>0){
            for(int i=0;i<superFiled.length;i++){
                fields[chirldLength+i] = superFiled[i];
            }
        }
        return fields;
    }

    /**
     * 将Map集合对象转换为Map<String,String>的基本信息
     * @param map
     * @return
     */
    public static Map<String,String> convertMapToStr(Map<String, String[]> map) {
        Map<String,String> params = new HashMap<String,String>();
        for (Iterator iter = map.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) map.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            //valueStr = 	EncodedUtils.encodeUtf8(valueStr);
            params.put(name, valueStr);
        }
        return params;
    }
}
