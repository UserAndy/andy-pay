package org.andy.pay.redis;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/*
*//**
 * 该类暂时不能打开注解，否则会与spring-redis中的连接池冲突,并会加载该文件JedisConnectionFactory与spring-redis
 * 中的文件进行替换。
 * Created by andy on 2016/11/9.
 *//*
@EnableRedisHttpSession
public class SessionConfig {

    private Logger LOGGER = Logger.getLogger(SessionConfig.class);
    @Bean
    public JedisConnectionFactory connectionFactory()
    {
        LOGGER.debug("This is SessionConfig method!");
        JedisConnectionFactory connection = new JedisConnectionFactory();
        connection.setPort(6379);
        connection.setHostName("192.168.241.133");
        return connection;
    }
}*/
