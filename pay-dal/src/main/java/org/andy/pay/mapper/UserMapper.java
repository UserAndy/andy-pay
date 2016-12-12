package org.andy.pay.mapper;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.andy.pay.model.UserInfo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 系统用户mapper
 * Created by andy on 16-11-30.
 */
@Repository
public interface UserMapper {

    /**
     * 添加用户
     * @param user
     * @return
     */
    boolean addUser(UserInfo user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    boolean modifyUser(UserInfo user);

    /**
     * 删除用户(修改标识,不做逻辑删除)
     * @param userid
     * @return
     */
    boolean deleteUser(@Param("userid") String userid);

    /**
     * 修改用户密码
     * @param info
     * @return
     */
    boolean modifyPassword(UserInfo info);

    /**
     * 获取用户信息
     * @param username　用户名
     * @return
     */
    UserInfo getUesrInfo(String username);

}
