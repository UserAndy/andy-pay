package org.andy.pay.model;

import  java.util.Date;
/**
 * @description:  用户表
 * @author: Andy
 * @date: 2017-02-23
 * @blog: www.andyqian.com
 */
public class User implements java.io.Serializable{

    private String id;

    /**
     * 用户名(唯一不可修改)
     */
    private String user_name;

    /**
     * 昵称
     */
    private String nick_name;

    /**
     * 登录名(唯一)
     */
    private String login_name;

    /**
     * (真实名字)不唯一
     */
    private String real_name;

    /**
     * 婚姻状态 1未婚    2 已婚  3 保密 0 未知
     */
    private int marita_status;

    /**
     * 教育状况
     */
    private int education_situation;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 邮编
     */
    private String zipcode;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 1 男  2 女  3 未知
     */
    private int sex;

    /**
     * 总余额
     */
    private String sum_balance;

    /**
     * 总积分
     */
    private int sum_integrate;

    /**
     * 当前余额
     */
    private String current_balance;

    /**
     * 当前积分
     */
    private int current_integrate;

    /**
     * 证件类型
     */
    private String id_type;

    /**
     * 证件号码
     */
    private String id_number;

    /**
     * 等级
     */
    private int grade;

    /**
     * 备注
     */
    private String remark;

    /**
     * 描述
     */
    private String description;

    /**
     * 头像
     */
    private String headurl;

    /**
     *
     */
    private Date brithday;

    /**
     * 来源 1 代表pc  2 移动端
     */
    private int source;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 详细地址
     */
    private String address;


    /**
     * 注册ip
     */
    private String register_ip;

    /**
     * 注册时间
     */
    private Date register_time;

    /**
     * 注册人
     */
    private String register_person;

    /**
     * 修改人
     */
    private String modify_person;

    /**
     * 修改时间
     */
    private Date modify_time;

    /**
     * 修改ip地址
     */
    private String modify_ip;

    /**
     * 1 正常使用   0 表示已冻结
     */
    private int is_freeze;

    /**
     * 1 正常使用   0 表示已冻结
     */
    private int is_use;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public int getMarita_status() {
        return marita_status;
    }

    public void setMarita_status(int marita_status) {
        this.marita_status = marita_status;
    }

    public int getEducation_situation() {
        return education_situation;
    }

    public void setEducation_situation(int education_situation) {
        this.education_situation = education_situation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSum_balance() {
        return sum_balance;
    }

    public void setSum_balance(String sum_balance) {
        this.sum_balance = sum_balance;
    }

    public int getSum_integrate() {
        return sum_integrate;
    }

    public void setSum_integrate(int sum_integrate) {
        this.sum_integrate = sum_integrate;
    }

    public String getCurrent_balance() {
        return current_balance;
    }

    public void setCurrent_balance(String current_balance) {
        this.current_balance = current_balance;
    }

    public int getCurrent_integrate() {
        return current_integrate;
    }

    public void setCurrent_integrate(int current_integrate) {
        this.current_integrate = current_integrate;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegister_ip() {
        return register_ip;
    }

    public void setRegister_ip(String register_ip) {
        this.register_ip = register_ip;
    }

    public Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }

    public String getRegister_person() {
        return register_person;
    }

    public void setRegister_person(String register_person) {
        this.register_person = register_person;
    }

    public String getModify_person() {
        return modify_person;
    }

    public void setModify_person(String modify_person) {
        this.modify_person = modify_person;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getModify_ip() {
        return modify_ip;
    }

    public void setModify_ip(String modify_ip) {
        this.modify_ip = modify_ip;
    }

    public int getIs_freeze() {
        return is_freeze;
    }

    public void setIs_freeze(int is_freeze) {
        this.is_freeze = is_freeze;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }
}
