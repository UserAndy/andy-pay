package org.andy.pay.mapper;

import org.andy.pay.model.Role;
import org.springframework.stereotype.Repository;

/**
 * @description: 角色表
 * @author: Andy
 * @date: 2017-02-25
 * @blog: www.andyqian.com
 */
@Repository
public interface RoleMapper {

    /**
     * 添加角色
     * @param role
     * @return
     */
    public boolean addRole(Role role);

    /**
     * 删除角色
     * @param role
     * @return
     */
    public boolean deleteRole(Role role);

    /**
     * 修改角色
     * @param role
     * @return
     */
    public boolean modifyRole(Role role);


    /**
     * 通过id 获取Role
     * @param id
     * @return
     */
    public Role getRoleById(String id);
}
