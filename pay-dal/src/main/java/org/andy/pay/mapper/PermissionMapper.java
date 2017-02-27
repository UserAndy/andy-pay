package org.andy.pay.mapper;

import org.andy.pay.model.Permission;
import org.springframework.stereotype.Repository;

/**
 * @description:  权限  mapper
 * @author: Andy
 * @date: 2017-02-27
 * @blog: www.andyqian.com
 */
@Repository
public interface PermissionMapper{

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
     * 根据id查找权限
     * @param id
     * @return
     */
    public Permission getPermissionById(String id);
}
