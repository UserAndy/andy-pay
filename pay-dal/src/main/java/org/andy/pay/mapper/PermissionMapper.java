package org.andy.pay.mapper;

import org.andy.pay.model.Permission;
import org.springframework.stereotype.Repository;

/**
 * Created by andy on 16-12-19.
 */
@Repository
public interface PermissionMapper {

    /**
     * 添加权限
     * @param permission
     * @return
     */
    public boolean addPermission(Permission permission);


    /**
     * 删除权限
     * @param permission
     * @return
     */
    public boolean deletePermission(Permission permission);

    /**
     * 修改权限
     * @param permission
     * @return
     */
    public boolean modifyPermission(Permission permission);

}
