package mappers;

import org.andy.pay.common.utils.UuidUtils;
import org.andy.pay.mapper.LoginLogMapper;
import org.andy.pay.model.LoginLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
/**
 * @description:
 * @author: Andy
 * @date: 2017-03-01
 * @blog: www.andyqian.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-applicationContext.xml"})
public class TestLoginLogMapper {

    @Autowired
    private LoginLogMapper loginLogMapper;
    /**
     * 添加登录邮箱
     */
    @Test
    public void testAddLog(){
        LoginLog log = new LoginLog();
        log.setId(UuidUtils.getUuid());
        log.setBrower("1111111");
        log.setType(1);
        log.setExit_time(new Date());
       boolean result = loginLogMapper.addLog(log);
        Assert.assertTrue(result);
    }
}
