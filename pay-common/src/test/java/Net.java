import org.junit.Test;

import java.net.URL;

/**
 * Created by andy on 17-1-10.
 */
public class Net {

    /**
     * 测试url链接信息
     */
    @Test
    public void testTestUrlPath(){
        try {
            URL url = new URL("http://www.baidu.com");
            System.out.println(url.getAuthority());
            System.out.println(url.getHost());
            System.out.println(url.getProtocol());
            System.out.println(url.getQuery());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
