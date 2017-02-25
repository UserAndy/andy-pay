package org.andy.pay.model;

import java.util.Date;
/**
 * @description:  操作日志表
 * @author: Andy
 * @date: 2017-02-23
 * @blog: www.andyqian.com
 */
public class OperationLogs implements java.io.Serializable{

    private String id;

    /**
     * 操作名称
     */
    private String operationName;

    /**
     * 模块名称
     */
    private String moudle;

    /**
     * 用户id
     */
    private String user_id;

    /**
     * 开始时间
     */
    private Date start_time;

    /**
     * 结束时间
     */
    private Date end_time;

    /**
     * 耗时
     */
    private int consume_time;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 描述
     */
    private String description;

    /**
     * ip地址
     */
    private String ip;


    /**
     * 请求主机
     */
    private String host;

    /**
     * 请求路径
     */
    private String requestPath;

    /**
     * 应用对象
     */
    private String referer;

    /**
     * 请求链接
     */
    private String connection;

    /**
     * 错误描述
     */
    private String fail_description;

    /**
     * user-agnt
     */
    private String user_agent;

    /**
     * 渲染时间
     */
    private int view_time;

    /**
     * action请求时间
     */
    private int action_time;

    /**
     * 是否使用
     */
    private int is_use;

    public OperationLogs() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getMoudle() {
        return moudle;
    }

    public void setMoudle(String moudle) {
        this.moudle = moudle;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public int getConsume_time() {
        return consume_time;
    }

    public void setConsume_time(int consume_time) {
        this.consume_time = consume_time;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getFail_description() {
        return fail_description;
    }

    public void setFail_description(String fail_description) {
        this.fail_description = fail_description;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public int getView_time() {
        return view_time;
    }

    public void setView_time(int view_time) {
        this.view_time = view_time;
    }

    public int getAction_time() {
        return action_time;
    }

    public void setAction_time(int action_time) {
        this.action_time = action_time;
    }

    public int getIs_use() {
        return is_use;
    }

    public void setIs_use(int is_use) {
        this.is_use = is_use;
    }
}
