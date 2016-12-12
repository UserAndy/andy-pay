package reference;

import org.junit.Test;

import java.lang.ref.SoftReference;

/**
 * description: 这是测试引用的使用方法
 *
 * @author: andy
 * Created by 2016/11/16 18:15
 */
public class TestRefernce {

    /**
     * 测试软引用
     */
    @Test
    public void testSoftReference(){
        Object object = new Object();
        SoftReference<Object> softReference = new SoftReference<Object>(object);
        object = null;
    }
}
