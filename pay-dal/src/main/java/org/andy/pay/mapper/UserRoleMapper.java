package org.andy.pay.mapper;

import org.andy.pay.model.Role;
import org.andy.pay.model.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:  用户角色关联表
 * @author: Andy
 * @date: 2017-02-25
 * @blog: www.andyqian.com
 */
@Repository
public interface UserRoleMapper {

    /**
     * 通过用户id 其关联关系
     * @param userId
     * @return
     */
    public List<UserRole> getUserRoleByUserId(String userId);

    /**
     * 通过用户获取其角色列表
     * @param userId
     * @return
     */
    public List<Role> getRoleByUserId(String userId);

    /**
     * 通过主键 获取UserRole 关系表
     * @param id
     * @return
     */
    public UserRole getUserRoleById(String id);

}
