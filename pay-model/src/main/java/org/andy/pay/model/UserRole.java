package org.andy.pay.model;

import java.util.Date;

/**
 * @version 1.0
 * @author andy
 * @description: 用户角色表,用于权限管理
 * @email andytohome@gmai.com
 */
public class UserRole implements java.io.Serializable{

    private String id;
    //用户id
    private String user_id;
    //角色id
    private String role_id;
    //创建时间
    private Date create_time;
    //创建用户
    private String create_user;
    //最后修改用户
    private String lastmodify_user;
    //最后修改时间
    private Date lastmodify_time;
    //状态
    private int status;
    //是否删除 0表示逻辑已删除　1表示正在使用
    private int is_use;

    public UserRole() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
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

    public String getLastmodify_user() {
        return lastmodify_user;
    }

    public void setLastmodify_user(String lastmodify_user) {
        this.lastmodify_user = lastmodify_user;
    }

    public Date getLastmodify_time() {
        return lastmodify_time;
    }

    public void setLastmodify_time(Date lastmodify_time) {
        this.lastmodify_time = lastmodify_time;
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
