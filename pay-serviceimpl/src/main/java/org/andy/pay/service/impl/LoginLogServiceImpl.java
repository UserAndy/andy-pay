package org.andy.pay.service.impl;

import org.andy.pay.mapper.LoginLogMapper;
import org.andy.pay.model.LoginLog;
import org.andy.pay.page.PageParams;
import org.andy.pay.page.PageResult;
import org.andy.pay.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Andy
 * @date: 2017-03-02
 * @blog: www.andyqian.com
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    private LoginLogMapper loginLogMapper;

    public PageResult getUserLoginLog(String userId, PageParams pageParams) {
        PageResult pageResult = new PageResult();
        int size = loginLogMapper.countUserLogByUserId(userId);
        List<LoginLog> list = loginLogMapper.getUserLog(userId,pageParams.getStart(),pageParams.getLength());
        pageResult.setData(list);
        pageResult.setRecordsTotal(size);
        //该参数必须有,否则无法分页
        pageResult.setRecordsFiltered(size);
        return pageResult;
    }
}
