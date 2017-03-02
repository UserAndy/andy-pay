package org.andy.pay.common.utils;

import java.util.Random;
import java.util.UUID;

/**
 * descritpion: 生成db唯一主键
 * author: andy
 * Created by andy on 2016/11/9.
 */
public class UuidUtils {

    /**
     * 获取唯一主键
     * @return
     */
    public static String getUuid(){
        String uuid = UUID.randomUUID().toString().replace("-","").trim();
        return uuid;
    }

    /**
     * 获取唯一的用户名
     * @return
     */
    public static String getUserName(){
        StringBuilder stringBuilder = new StringBuilder("u_");
        String result="1234567890qwertyuiopasdfghjklzxcvbnm";
        char[] arrays = result.toCharArray();
        for(int i =0;i<15;i++) {
            Random random = new Random();
            int index = random.nextInt(result.length());
            stringBuilder.append(arrays[index]);
        }
       return stringBuilder.toString();
    }
}
