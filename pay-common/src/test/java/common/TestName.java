package common;

import org.junit.Test;

/**
 * Created by andy on 16-12-5.
 */
public class TestName {

    /**
     * 测试名字
     */
    @Test
    public void testName(){
        System.out.println("getName:"+TestName.class.getName());
        System.out.println("getCanonicalName:"+TestName.class.getCanonicalName());
        System.out.println("getSimpleName:"+TestName.class.getSimpleName());
    }
}
