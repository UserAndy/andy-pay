import org.andy.pay.common.utils.UuidUtils;
import org.junit.Test;

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
}
