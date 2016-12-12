package enums;

import org.andy.pay.enums.LoginType;
import org.junit.Test;

/**
 * description: 这是测试日志枚举类型
 *
 * @author: andy
 * Created by 2016/11/15 1:43
 */
public class TestLogStatus {

    /**
     * 获取日志状态
     */
    @Test
    public void testGetLogStatus(){
        System.out.println(LoginType.API.getStatus());           //获取枚举的日志信息
        System.out.println(LoginType.API.getDescrption());           //获取枚举的日志信息
    }
}
