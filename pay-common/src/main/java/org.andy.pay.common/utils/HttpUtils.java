package org.andy.pay.common.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * descritpion: http请求工具类
 * author: andy
 * Created by andy on 2016/11/9.
 */
public class HttpUtils {

    /**
     * 获取远程的ip地址  (这里主要考虑有代理地址,所以进行判断)
     * @param request
     * @return
     */
    public static String getRemoteIp(HttpServletRequest request){
            String ip = request.getHeader("x-forwarded-for");
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_CLIENT_IP");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
            return ip;
        }
}
