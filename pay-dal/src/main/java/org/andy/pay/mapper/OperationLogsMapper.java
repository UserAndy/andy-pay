package org.andy.pay.mapper;

import org.andy.pay.model.OperationLogs;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:  操作日志类
 * @author: Andy
 * @date: 2017-02-25
 * @blog: www.andyqian.com
 */
@Repository
public interface OperationLogsMapper {

    /**
     * 添加操作日志类
     * @param log
     * @return
     */
    public boolean addOperationLog(OperationLogs log);


    /**
     * 通过用户名查找其操作日志
     * @param userId
     * @return
     */
    public List<OperationLogs> getOperationLogsByUserId(String userId);


}
