package org.andy.pay.common.conn;

import java.util.Map;

/**
 * version: 1.0
 * description:链接工具类,如果需要扩展,即可
 * author:Andy
 * date: 2017/01/22
 */
public interface BaseConnection {

    /**
     * 执行
     * @param method
     * @param path
     * @param map
     * @param data
     * @return
     */
    String execute(String method, String path,
                              Map<String, String> map, String data);
}
