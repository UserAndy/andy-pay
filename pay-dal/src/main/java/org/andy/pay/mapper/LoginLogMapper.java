package org.andy.pay.mapper;


import org.andy.pay.model.LoginLog;
import org.apache.ibatis.annotations.Param;
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
     * 修改退出时间
     * @return
     */
    boolean modifyExitTimeByUserId();

    /**
     * 获取用户日志列表
     * @param userId  用户id
     * @param pageStart  其实角标
     * @param pageSize   页面大小
     * @return
     */
    List<LoginLog> getUserLog(@Param("userId")String userId,@Param("pageStart") int pageStart,@Param("pageSize") int pageSize);


    /**
     * 统计用户的登录日志的数量
     * @param userId
     * @return
     */
    int countUserLogByUserId(@Param("userId") String userId);
}
