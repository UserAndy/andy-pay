package controller;

import org.andy.pay.mapper.LogMapper;
import org.andy.pay.model.LoginLog;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * description: 用户Controller测试
 *
 * @author: andy
 * Created by 2016/11/17 10:09
 */
public class UserControllerTestCase extends AbstractTestCase{

    @Autowired
    private LogMapper logMapper;

    /**
     * 测试用户信息
     */
    @Test
    public void test(){
        List<LoginLog> list =  logMapper.getUserLog("1");
        Assert.assertNotNull(list);
    }
}
