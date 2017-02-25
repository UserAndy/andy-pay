package org.andy.pay.mapper;


import org.andy.pay.model.LoginLogs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description: 这是日志操作mapper
 * @author: andy
 * Created by 2016/11/12 15:06
 */
@Repository
public interface LoginLogsMapper {

    /**
     * 新增log
     * @param info;
     * @return
     */
    boolean addLog(LoginLogs info);


    /**
     * 获取用户日志log
     * @param userId
     * @return
     */
    List<LoginLogs> getUserLog(@Param("userId")String userId);
}
