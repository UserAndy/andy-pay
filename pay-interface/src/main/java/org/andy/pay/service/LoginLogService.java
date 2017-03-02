package org.andy.pay.service;

import org.andy.pay.page.PageParams;
import org.andy.pay.page.PageResult;

/**
 * @description:  登录日志service
 * @author: Andy
 * @date: 2017-03-02
 * @blog: www.andyqian.com
 */
public interface LoginLogService {

    /**
     * 根据用户id查找用户的基本信息
     * @param userId  用户id
     * @param pageParams  分页参数的页面信息
     * @return
     */
    public PageResult getUserLoginLog(String userId, PageParams pageParams);
}
