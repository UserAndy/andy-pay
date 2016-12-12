package org.andy.pay.model;

import java.util.Date;

/**
 * description: 这是操作日志
 *
 * @author: andy
 * Created by 2016/11/27 14:59
 */
public class LoginLog implements java.io.Serializable{
    //主键
    private String id;
    //用户id
    private String user_id;
    //登录时间
    private Date login_time;
    //退出时间
    private Date exit_time;
    //登陆ip
    private String login_ip;
    //登录类型
    private int login_type;
    //登陆浏览器
    private String login_browser;
    //登录操作系统
    private String login_operateSystem;
    //状态 0 逻辑已删除　　　１表示逻辑未删除  default:1
    private int is_use;

    public LoginLog() {
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

    public String getLogin_ip() {
        return login_ip;
    }

    public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip;
    }

    public int getLogin_type() {
        return login_type;
    }

    public void setLogin_type(int login_type) {
        this.login_type = login_type;
    }

    public String getLogin_browser() {
        return login_browser;
    }

    public void setLogin_browser(String login_browser) {
        this.login_browser = login_browser;
    }

    public String getLogin_operateSystem() {
        return login_operateSystem;
    }

    public void setLogin_operateSystem(String login_operateSystem) {
        this.login_operateSystem = login_operateSystem;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }
}
