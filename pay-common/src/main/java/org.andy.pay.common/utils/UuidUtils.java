package org.andy.pay.common.utils;

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
}
