package mappers;

import java.util.Date;
import org.andy.pay.common.utils.UuidUtils;
import org.andy.pay.mapper.UserMapper;
import org.andy.pay.model.User;
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
        boolean result = true;
        for(int i = 0;i<10000000;i++) {
            User info = new User();
            info.setId(UuidUtils.getUuid());
            info.setUsername(UuidUtils.getUuid());
            info.setPassword("password");
            info.setAddress("大唐村");
            info.setEmail("80413902@qq.com");
            info.setCountry("湖南省");
            info.setCity("长沙市");
            info.setLastlogin_ip("127.0.0.1");
            info.setLastlogin_time(new Date());
            info.setHeadurl("www.baidu.com/headurl/");
            info.setRegister_ip("127.0.0.1");
            info.setRegister_time(new Date());
            info.setIs_locked(true);
            result = userMapper.addUser(info);
        }
        Assert.assertTrue(result);
    }

    /**
     * 判断锁定
     */
    @Test
    public void testGetUser(){
        User info = userMapper.getUesrInfo("13a11b2165534b0992b41621f28d8ac5");
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
        User info = userMapper.getUesrInfo("username");
        System.out.println(info.is_locked());
        if(Boolean.FALSE.equals(info.is_locked())){
            System.out.println("未锁定");
        }else{
            System.out.println("已锁定");
        }
    }
}
