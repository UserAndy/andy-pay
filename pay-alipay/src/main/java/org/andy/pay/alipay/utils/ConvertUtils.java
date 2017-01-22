package org.andy.pay.alipay.utils;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

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
            try {
            result = new HashMap<String,String>();
            Class<?> objectClass = object.getClass();
            Field[] array = groupField(objectClass.getDeclaredFields(),objectClass.getSuperclass().getDeclaredFields());
            System.out.println("-------------------------------------------");
                if (array != null) {
                    for (Field field : array) {
                        field.setAccessible(true);
                        String name = field.getName();
                        if(name!=null&&!"".equals(name)) {
                            Object obj = field.get(object);
                            System.out.println("name-->"+name+"    <--->"+obj);
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
                fields[chirldLength] = superFiled[i];
            }
        }
        return fields;
    }
}
