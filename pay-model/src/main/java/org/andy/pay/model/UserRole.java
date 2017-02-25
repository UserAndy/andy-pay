package org.andy.pay.model;

import  java.util.Date;

/**
 * @description: 用户角色关联表
 * @author: Andy
 * @date: 2017-02-23
 * @blog: www.andyqian.com
 */
public class UserRole implements java.io.Serializable{

    private String id;

    /**
     * 用户id
     */
    private String user_id;

    /**
     * 角色id
     */
    private String role_id;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 创建人
     */
    private String create_person;

    /**
     * 修改时间
     */
    private Date update_time;

    /**
     * 修改人
     */
    private String update_person;

    /**
     * 逻辑删除标识  0 表示删除  1 表示正常数据
     */
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

    public String getCreate_person() {
        return create_person;
    }

    public void setCreate_person(String create_person) {
        this.create_person = create_person;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_person() {
        return update_person;
    }

    public void setUpdate_person(String update_person) {
        this.update_person = update_person;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }
}
