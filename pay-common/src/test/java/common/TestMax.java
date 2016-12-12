package common;

import org.andy.pay.common.utils.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * 测试max
 * Created by andy on 16-11-27.
 */
public class TestMax {

    /**
     * 测试max
     */
    @Test
    public void testMax(){
        int max  = 10;
        int minvalue = 20;
        int currentValue = Math.max(max,minvalue);
        System.out.println(currentValue);
    }

    /**
     * 设置值
     */
    @Test
    public void testMaxValue(){
        int value = 1 << 30;
        System.out.println(value);
    }

    /**
     * 设置工具类
     */
    @Test
    public void testStringUtils(){
        String content = "";
        Assert.assertTrue(StringUtils.isEmpty(content));
        String content1 = "11111";
        Assert.assertFalse(StringUtils.isEmpty(content1));
    }

}
