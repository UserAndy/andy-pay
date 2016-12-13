package org.andy.pay.common.utils;

/**
 * 浏览器版本判断
 *
 */
public class UserAgentUtils {

    /**
     * 判断是否是移动端访问
     * @param userAgent
     * @return
     */
    public static boolean isMobile(String userAgent) {
        boolean flag = false;
        userAgent = userAgent.toLowerCase();
        if (userAgent.indexOf("mobile") > -1 || userAgent.indexOf("android") > -1 || userAgent.indexOf("iphone") > -1
                || userAgent.indexOf("ipad") > -1) {
            flag = true;
        }
        return flag;
    }
}
