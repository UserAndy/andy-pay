package org.andy.pay.service;

import org.andy.pay.model.ResultCode;
import org.andy.pay.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 用户service
 */
public interface UserService {

    /**
     * 添加用户的基本信息
     * @param user  待添加的用户信息
     * @return
     */
    public ResultCode addBasicUser(User user);

    /**
     * 删除用户 (逻辑删除)
     * @param userId
     * @return
     */
    public ResultCode deleteUser(String userId,Date handler_time,String handler_user);

    /**
     * 冻结用户
     * @param userId            用户id
     * @param handlerUser       处理用户
     * @param handlerTime       处理时间
     * @return
     */
    public ResultCode freezeUser(String userId,String handlerUser,Date handlerTime);

    /**
     * 解除冻结用户
     * @param userId    用户id
     * @param handlerUser  处理的用户
     * @param handlerTime   处理时间
     * @return
     */
    public ResultCode unfreezeUser(String userId,String handlerUser,Date handlerTime);

    /**
     * 修改用户的基本信息
     * @param user
     * @return
     */
    public ResultCode modifyBasicUser(User user);


    /**
     * 通过用户id 来查找用户
     * @param userId
     * @return
     */
    public User getUserById(String userId);

    /**
     * 通过名称来查找用户
     * @param loginName
     * @return
     */
    public User getUserByLoginName(String loginName);

    /**
     * 通过手机号码来查找用户信息
     * @param telephone
     * @return
     */
    public User getUserByTelephone(String telephone);

    /**
     * 根据邮箱来查找用户
     * @param email
     * @return
     */
    public User getUserByEmail(String email);


    /**
     * 修改密码
     * @param user
     * @return
     */
    public ResultCode resetPassword(User user,HttpServletRequest request);

    /**
     * 用户登录
     * @param
     * @return
     */
    public void login(String email,HttpServletRequest request);

    /**
     * 用户注册
     * @param user      待注册的用户
     * @param request   请求
     * @return
     */
    public ResultCode register(User user, HttpServletRequest request);


    /**
     * 验证邮箱号码是否已经存在
     * @param email
     * @return
     */
    public ResultCode validateEmail(String email);
}
