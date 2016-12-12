package org.andy.pay.service;

import org.andy.pay.model.LoginLog;

import java.util.List;

/**
 * description: 这是日志的service
 *
 * @author: andy
 * Created by 2016/11/16 12:40
 */
public interface LogService {

    /**
     * 新增log
     * @param info;
     * @return  true 操作成功    false 操作失败
     */
    boolean addLog(LoginLog info);

    /**
     * 删除日志
     * @param id  待删除的日志
     * @return true 操作成功    false 操作失败
     */
    boolean removeLog(String id);


    /**
     * 获取用户日志log
     * @param userId
     * @return 该用户的日志信息
     */
    List<LoginLog> getUserLog(String userId);

}
