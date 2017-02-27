package org.andy.pay.model;

import java.util.Date;
/**
 * @description: 权限表
 * @author: Andy
 * @date: 2017-02-23
 * @blog: www.andyqian.com
 */
public class Permission implements java.io.Serializable{
    
    private String id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String create_person;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 修改人
     */
    private String update_person;

    /**
     * 修改时间
     */
    private Date update_time;

    /**
     * 0 表示正在使用  1 表示逻辑已删除
     */
    private int is_use;

    public Permission() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreate_person() {
        return create_person;
    }

    public void setCreate_person(String create_person) {
        this.create_person = create_person;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_person() {
        return update_person;
    }

    public void setUpdate_person(String update_person) {
        this.update_person = update_person;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }
}
