import org.andy.pay.common.utils.ValidateUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: Andy
 * @date: 2017-02-28
 * @blog: www.andyqian.com
 */
public class TestValidateUtils {

    /**
     * 判断验证邮箱号码
     */
    @Test
    public void testValidateEmail(){
        boolean result = ValidateUtils.isEmail("804139028qq.com");
        Assert.assertTrue(result);
    }
}
