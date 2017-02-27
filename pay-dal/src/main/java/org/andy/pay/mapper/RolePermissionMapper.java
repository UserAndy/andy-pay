package org.andy.pay.mapper;

import org.andy.pay.model.Permission;
import org.andy.pay.model.RolePermission;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:  角色权限 mapper
 * @author: Andy
 * @date: 2017-02-27
 * @blog: www.andyqian.com
 */
@Repository
public interface RolePermissionMapper {

    /**
     * 添加角色权限
     * @param rolePermission  待添加的角色权限
     * @return
     */
    public boolean addRolePermission(RolePermission rolePermission);

    /**
     * 通过id 获取 RolePermission
     * @param id
     * @return
     */
    public RolePermission getRolePermissionById(String id);


    public List<Permission> getPermissionByRoldId(String roleId);

    /**
     * 逻辑删除 RolePermission
     * @param id
     * @return
     */
    public boolean deleteRolePermission(String id);
}
