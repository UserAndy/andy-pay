package common;

import org.andy.pay.common.utils.EncryptUtils;
import org.junit.Test;

/**
 * 测试 EncryptUtils　工具类
 * Created by andy on 16-11-29.
 */
public class TestEncryptUtils {

    /**
     * 测试md5 加密
     * 加密前: content
     * 加密后: 9a0364b9e99bb480dd25e1f0284c8555
     */
    @Test
    public void testMd5(){
        String content = "content";
       String password = EncryptUtils.EncryptMD5(content);
        System.out.println(password);
    }

    /**
     * 测试sha1 加密工具类
     */
    @Test
    public void testSHA1(){
        String content = "content";
        String password = EncryptUtils.EncryptSHA1(content);
        System.out.println(password);
    }

    /**
     * base 64　加密   Y29udGVudA==
     */
    @Test
    public void testBase64Encode(){
        String array = "content";
        byte[] bits = array.getBytes();
        String content = EncryptUtils.base64Encode(bits);
        System.out.println("加密后: "+content);
    }

    /**
     * base 64　解密
     */
    @Test
    public void testBase64Decode(){
        String password = "Y29udGVudA==";
        byte[] bits = EncryptUtils.base64Decode(password);
        System.out.println("解密后: "+new String(bits));
    }
}
