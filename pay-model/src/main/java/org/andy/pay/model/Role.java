package org.andy.pay.model;

import  java.util.Date;
/**
 * @description: 角色表
 * @author: Andy
 * @date: 2017-02-23
 * @blog: www.andyqian.com
 */
public class Role implements java.io.Serializable{

    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 权限代码
     */
    private String code;

    /**
     * 权限描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 创建人
     */
    private String create_user;

    /**
     * 修改时间
     */
    private Date update_time;

    /**
     * 修改人
     */
    private String update_user;

    /**
     * 0 表示正常数据  1 表示逻辑已删除数据
     */
    private int is_use;

    public Role() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }
}
