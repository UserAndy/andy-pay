package jredis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * description: 这是测试Jredis连接
 *
 * @author: andy
 * Created by 2016/11/14 11:32
 */
public class TestJredis {
    /**
     * 测试连接
     */
    @Test
    public void testConnection(){
        Jedis  jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("andy","qian");
        System.out.println(jedis.get("andy"));
        System.out.println(jedis.ping());
    }
}
