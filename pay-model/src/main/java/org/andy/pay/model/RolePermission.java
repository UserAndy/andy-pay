package org.andy.pay.model;

import java.util.Date;

/**
 * @version 1.0
 * @author andy
 * @description: 用户角色表,用于权限管理
 * @email andytohome@gmail.com
 */
public class RolePermission implements java.io.Serializable{
    private String id;
    //角色id
    private String role_id;
    //权限id
    private String permission_id;
    //创建时间
    private Date create_time;
    //创建人
    private String create_user;
    //最后修改时间
    private Date lastmodify_time;
    //修改人
    private String lastmodify_user;
    //状态
    private int status;
    //是否逻辑删除 0表示逻辑已删除　　1表示正在使用
    private int is_use;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(String permission_id) {
        this.permission_id = permission_id;
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
