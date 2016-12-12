package mappers;

import org.andy.pay.common.utils.UuidUtils;
import org.andy.pay.mapper.UserMapper;
import org.andy.pay.model.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 这是测试用例,每个mapper都需要进行这种测试,以排除一些低级错误
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-applicationContext.xml"})
public class TestUserInfoMapper {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试添加用户
     */
    @Test
    public void testlogin(){
        UserInfo info  = new UserInfo();
        info.setId(UuidUtils.getUuid());
        info.setUsername(UuidUtils.getUuid());
        info.setPassword("password");
        info.setIs_locked(true);
        boolean result = userMapper.addUser(info);
        Assert.assertTrue(result);
    }

    /**
     * 判断锁定
     */
    @Test
    public void testGetUser(){
        UserInfo info = userMapper.getUesrInfo("13a11b2165534b0992b41621f28d8ac5");
        System.out.println(info.is_locked());
        if(Boolean.TRUE.equals(info.is_locked())){
            System.out.println("已锁定");
        }else{
            System.out.println("未锁定");
        }
    }

    /**
     * 判断是否锁定
     */
    @Test
    public void testBooleanFalse(){
        UserInfo info = userMapper.getUesrInfo("username");
        System.out.println(info.is_locked());
        if(Boolean.FALSE.equals(info.is_locked())){
            System.out.println("未锁定");
        }else{
            System.out.println("已锁定");
        }
    }
}
