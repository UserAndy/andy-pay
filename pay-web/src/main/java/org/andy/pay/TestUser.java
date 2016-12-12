package org.andy.pay;

import org.andy.pay.common.utils.UuidUtils;

/**
 * Created by andy on 2016/11/8.
 */
public class TestUser {

    /**
     * 导入
     * ceshi添加
     * @param args
     */
    public static void main(String[] args){
        String uuid = returnUuid();
    }


    private static String returnUuid(){
        String uuid = UuidUtils.getUuid();
        return uuid;
    }
}
