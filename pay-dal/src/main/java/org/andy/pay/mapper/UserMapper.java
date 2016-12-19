package org.andy.pay.mapper;

import org.andy.pay.model.User;;
import org.andy.pay.model.UserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * 系统用户mapper
 * Created by andy on 16-11-30.
 */
@Repository
public interface UserMapper {

    /**
     * 添加用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    boolean modifyUser(User user);

    /**
     * 删除用户(修改标识,不做逻辑删除)
     * @param userid
     * @return
     */
    boolean deleteUser(@Param("userid") String userid);

    /**
     * 获取用户信息
     * @param username　用户名
     * @return
     */
    User getUesrInfo(String username);

    /**
     * 修改用户密码
     * @param info
     * @return
     */
    boolean modifyPassword(User info);

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
     void changePassword(@Param("userId") String userId, @Param("password") String newPassword);

    /**
     * 添加用户与角色的关系
     * @param userRole
     */
     void correlationRoles(UserRole userRole);

    /**
     * 移除用户与角色的关系
     * @param userRole
     */
     void uncorrelationRoles(UserRole userRole);


    /**
     * 根据用户名查找用户的角色
     * @param userId
     * @return
     */
     Set<String> findRoleByUserId(String userId);


    /**
     * 根据用户名查找用户的权限
     * @param userId
     * @return
     */
    Set<String> findPermissionByUserId(String userId);

}
