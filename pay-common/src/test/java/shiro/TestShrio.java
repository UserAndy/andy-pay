package shiro;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.H64;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andy on 16-12-18.
 */
public class TestShrio {

    /**
     * 测试shiro　base64　加解密
     */
    @Test
    public void testShiroBase64(){
        String password = "hello";
        String str1 = Base64.encodeToString(password.getBytes());
        String str2 = Base64.decodeToString(str1);
        Assert.assertEquals(password,str2);
    }

    /**
     * 测试hex加解密
     */
    @Test
    public void testHexo(){
        String pass = "hello";
        String str1 = Hex.encodeToString(pass.getBytes());  //加密后
        String str2 = new String(Hex.decode(str1));
        Assert.assertEquals(pass,str2);
    }

    /**
     * 测试 hex64　信息
     */
    @Test
    public void testHex64(){
        String pass = "hello";
        String str1 = H64.encodeToString(pass.getBytes());
        System.out.println(str1);
    }

    /**
     *　测试md5　测试账号
     */
    @Test
    public void testMd5(){
        String password = "password";
        String salt = "hello";
        String encodePassword = new Md5Hash(password,salt).toString();
        System.out.println(encodePassword);
    }

    /**
     * 测试246　hash
     */
    @Test
    public void testS256Hash(){
        String password = "password";
        String salt = "hello";
        String encodePassword = new Sha256Hash(password,salt).toString();
        System.out.println(encodePassword);
    }
}
