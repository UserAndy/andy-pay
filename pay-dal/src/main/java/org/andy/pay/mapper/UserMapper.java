package org.andy.pay.mapper;

import org.andy.pay.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
/**
 * @description:  用户操作类
 * @author: Andy
 * @date: 2017-02-25
 * @blog: www.andyqian.com
 */
@Repository
public interface UserMapper {

    /**
     * 添加用户的基本信息
     * @param user  待添加的用户信息
     * @return
     */
    public boolean addBasicUser(User user);

    /**
     * 删除用户 (逻辑删除)
     * @param userId
     * @return
     */
    public boolean deleteUser(@Param("userId") String userId, @Param("handler_time") Date handler_time,@Param("handler_user") String handler_user);

    /**
     * 冻结用户
     * @param userId            用户id
     * @param handlerUser       处理用户
     * @param handlerTime       处理时间
     * @return
     */
    public boolean freezeUser(@Param("userId") String userId,@Param("handlerUser")String handlerUser,@Param("handlerTime") Date handlerTime);

    /**
     * 解除冻结用户
     * @param userId    用户id
     * @param handlerUser  处理的用户
     * @param handlerTime   处理时间
     * @return
     */
    public boolean unfreezeUser(@Param("userId") String userId,@Param("handlerUser") String handlerUser,@Param("handlerTime") Date handlerTime);

    /**
     * 修改用户的基本信息
     * @param user
     * @return
     */
    public boolean modifyBasicUser(User user);


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
    public boolean modifyPassword(User user);

    /**
     * 用户登录
     * @param username
     * @return
     */
    public User login(String username);
}
