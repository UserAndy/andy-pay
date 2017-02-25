package org.andy.pay.model;

import java.util.Date;
/**
 * @description:  登录日志
 * @author: Andy
 * @date: 2017-02-23
 * @blog: www.andyqian.com
 */
public class LoginLogs implements java.io.Serializable{

    private String id;

    /**
     * 登录时间
     */
    private Date login_time;

    /**
     * 退出时间
     */
    private Date exit_time;

    /**
     * 登录用户
     */
    private String user_id;

    /**
     * ip
     */
    private String ip;

    /**
     * 城市
     */
    private String city;

    /**
     * 系统
     */
    private String os;

    /**
     * 浏览器
     */
    private String brower;

    /**
     * 描述
     */
    private String description;

    /**
     * 备注
     */
    private String remark;

    /**
     * 登录类型
     */
    private int type;

    /**
     * 
     */
    private String info;

    /**
     * 用户名
     */
    private String username;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 1 表示正常数据   0 表示逻辑已删除数据
     */
    private int is_use;

    public LoginLogs() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public Date getExit_time() {
        return exit_time;
    }

    public void setExit_time(Date exit_time) {
        this.exit_time = exit_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrower() {
        return brower;
    }

    public void setBrower(String brower) {
        this.brower = brower;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }
}
