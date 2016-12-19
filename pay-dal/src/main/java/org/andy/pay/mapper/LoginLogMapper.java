package org.andy.pay.mapper;

import org.andy.pay.model.LoginLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description: 这是日志操作mapper
 * @author: andy
 * Created by 2016/11/12 15:06
 */
@Repository
public interface LoginLogMapper {

    /**
     * 新增log
     * @param info;
     * @return
     */
    boolean addLog(LoginLog info);


    /**
     * 修改日志状态
     * @param id
     * @param is_use  1 正在使用　　　0 表示逻辑已删除
     * @return
     */
    boolean modifyLogStatus(String id,int is_use);

    /**
     * 获取用户日志log
     * @param userId
     * @return
     */
    List<LoginLog> getUserLog(String userId);
}
