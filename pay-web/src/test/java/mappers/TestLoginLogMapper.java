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
 * @description: 测试添加登录日志的基本信息
 * @author: Andy
 * @date: 2017-02-16
 * @blog: www.andyqian.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-applicationContext.xml"})
public class TestLoginLogMapper {

    @Autowired
    private LoginLogMapper loginLogMapper;

    /**
     * 测试添加登录日志
     */
    @Test
    public void testaddLog(){
        LoginLog log = new LoginLog();
        log.setLogin_type(1);
        log.setLogin_ip("127.0.0.1");
        log.setLogin_browser("浏览器");
        log.setId(UuidUtils.getUuid());
        log.setExit_time(new Date());
        log.setUser_id(UuidUtils.getUuid());
        log.setLogin_operateSystem("windows 10");
        boolean result = loginLogMapper.addLog(log);
        Assert.assertEquals(true,result);
    }
}
