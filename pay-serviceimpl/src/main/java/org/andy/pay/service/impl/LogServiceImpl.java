package org.andy.pay.service.impl;

import org.andy.pay.mapper.LoginLogsMapper;
import org.andy.pay.model.LoginLog;
import org.andy.pay.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 这是登录日志service实现类
 *
 * @author: andy
 * Created by 2016/11/16 12:45
 */
@Service
public class LogServiceImpl implements LogService{

    @Autowired
    private LoginLogsMapper loginLogsMapper;

    public boolean addLog(LoginLog info) {
        return loginLogsMapper.addLog(info);
    }

    public boolean removeLog(String id) {

        return loginLogsMapper.modifyLogStatus(id,0);
    }

    public List<LoginLog> getUserLog(String userId) {
        return loginLogsMapper.getUserLog(userId);
    }
}
