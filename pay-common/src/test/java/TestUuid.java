import org.andy.pay.common.utils.UuidUtils;
import org.junit.Test;

import java.util.Random;

/**
 * description: 测试uuid
 *
 * @author: andy
 * Created by 2016/11/17 14:03
 */
public class TestUuid {

    /**
     * 生成多少个uuid
     */
    @Test
    public void testuuid(){
        for(int i = 0;i<100;i++){
            System.out.println(UuidUtils.getUuid());
        }
    }

    @Test
    public void getUuidLen(){
        System.out.println(UuidUtils.getUuid().length());
    }

    /**
     * 判断
     */
    @Test
    public void testTrue(){
        System.out.println("true--->"+Boolean.TRUE.hashCode());
        System.out.println("false--->"+Boolean.FALSE.hashCode());
    }

    @Test
    public void testChar(){
        char[] array = new char[3];
        array[1] = '1';
        array[2] = '中';
        array[0] = '2';
        String result = new String(array);
        System.out.println(result);

    }

    /**
     * 测试用户名
     */
    @Test
    public void testUserName(){
        StringBuilder stringBuilder = new StringBuilder("u_");
        String result="1234567890qwertyuiopasdfghjklzxcvbnm";
        char[] arrays = result.toCharArray();
        for(int i =0;i<15;i++) {
            Random random = new Random();
            int index = random.nextInt(result.length());
            stringBuilder.append(arrays[index]);
        }
        System.out.println(stringBuilder.toString());
    }
}
