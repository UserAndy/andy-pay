package org.andy.pay.model;

import java.util.Date;

/**
 * description:
 *
 * @author: andy
 * Created by 2016/11/12 15:03
 */
public class User implements java.io.Serializable{
    //主键
    private String id;
    //修改日期
    private Date modifyDate;
    //用户名
    private String username;
    //密码(md5单向加密)
    private String password;
    //联系电话
    private String telephone;
    //邮箱
    private String email;
    //头像地址
    private String headurl;
    //详细地址
    private String address;
    //省
    private String province;
    //城市
    private String city;
    //国家
    private String country;
    //注册时间
    private Date register_time;
    //注册ip
    private String register_ip;
    //最后登陆时间
    private Date lastlogin_time;
    //最后登录ip
    private String lastlogin_ip;
    //状态　0　未使用 1　使用中　　默认为１
    private int is_use;
    //盐
    private String salt;

    /**
     * //是否锁定　true　表示已锁定　false　表示未锁定
     * Boolean.TRUE.equals(info.is_locked()) 表示锁定
     * Boolean.FALSE.equals() 表示未锁定
     */
    private boolean is_locked;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }

    public String getRegister_ip() {
        return register_ip;
    }

    public void setRegister_ip(String register_ip) {
        this.register_ip = register_ip;
    }

    public Date getLastlogin_time() {
        return lastlogin_time;
    }

    public void setLastlogin_time(Date lastlogin_time) {
        this.lastlogin_time = lastlogin_time;
    }

    public String getLastlogin_ip() {
        return lastlogin_ip;
    }

    public void setLastlogin_ip(String lastlogin_ip) {
        this.lastlogin_ip = lastlogin_ip;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }

    public boolean is_locked() {
        return is_locked;
    }

    public void setIs_locked(boolean is_locked) {
        this.is_locked = is_locked;
    }
}
