package org.andy.pay.model;

import java.util.Date;

/**
 * @version 1.0
 * @author andy
 * @description: 用户角色表,用于权限管理
 * @email andytohome@gmai.com
 */
public class Permission implements java.io.Serializable{

    private String id;
    //权限名称
    private String permission_name;
    //权限描述
    private String permission_description;
    //创建时间
    private Date create_time;
    //创建人
    private String create_user;
    //修改时间
    private Date lastmodify_time;
    //修改人
    private String lastmodify_user;
    //状态
    private int status;
    //是否逻辑删除 0表示逻辑已删除　1表示正在使用
    private int is_use;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name;
    }

    public String getPermission_description() {
        return permission_description;
    }

    public void setPermission_description(String permission_description) {
        this.permission_description = permission_description;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public Date getLastmodify_time() {
        return lastmodify_time;
    }

    public void setLastmodify_time(Date lastmodify_time) {
        this.lastmodify_time = lastmodify_time;
    }

    public String getLastmodify_user() {
        return lastmodify_user;
    }

    public void setLastmodify_user(String lastmodify_user) {
        this.lastmodify_user = lastmodify_user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }
}
