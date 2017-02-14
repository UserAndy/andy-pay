package org.andy.pay.service;

import org.andy.pay.common.bean.ResultCode;
import org.andy.pay.model.User;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户service
 * Created by andy on 16-12-1.
 */
public interface UserInfoService {


    /**
     * 用户登陆
     * @param info;
     * @param request
     * @return  true 操作成功    false 操作失败
     */
   public void login(User info);

    /**
     * 删除日志
     * @param id  待删除的日志
     * @return true 操作成功    false 操作失败
     */
    public boolean deleteUser(String id);

    /**
     *
     * @param user
     * @return
     */
    public ResultCode register(User user, HttpServletRequest request);


    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username);


}
