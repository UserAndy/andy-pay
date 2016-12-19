package org.andy.pay.mapper;

import org.andy.pay.model.Role;
import org.andy.pay.model.RolePermission;
import org.springframework.stereotype.Repository;

/**
 * Created by andy on 16-12-19.
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
     * 移除角色
     * @param role
     * @return
     */
    public boolean remoreRole(Role role);


    /**
     * 添加角色与权限之间的关系
     * @param rolePermission
     * @return
     */
    public boolean correlationPermissions(RolePermission rolePermission);

    /**
     * 移除角色与权限的关系
     * @param rolePermission
     * @return
     */
    public boolean uncorrelationPermissions(RolePermission rolePermission);
}
