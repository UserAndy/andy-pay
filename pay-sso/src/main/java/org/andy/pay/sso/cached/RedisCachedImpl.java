package org.andy.pay.sso.cached;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.andy.pay.sso.utils.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * redis缓存impl
 *
 */
@Component("redisCached")
public class RedisCachedImpl implements ICached {

	public RedisCachedImpl() {

	}
	// -1 - never expire
	/** 过期时间 */
	private int expire = -1;
	
	/** redis模板 */
	@Resource(name="redisTemplate")
	private RedisTemplate<String, Object> redisTemplate;


	/**
	 *  删除 缓存
	 */
	public String deleteCached(final byte[] sessionId) throws Exception {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Long doInRedis(RedisConnection connection)
					throws DataAccessException {
				connection.del(sessionId);
				return null;
			}
		});
		return null;
	}

	/**
	 *  更新 缓存
	 */
	public String updateCached(final byte[] key, final byte[] session,final Long expireSec)
			throws Exception {
		return (String) redisTemplate.execute(new RedisCallback<Object>() {
			public String doInRedis(final RedisConnection connection)
					throws DataAccessException {
				connection.set(key, session);
				if(expireSec!=null){
					connection.expire(key, expireSec);
				}else{
					connection.expire(key, expire);
				}
				return new String(key);
			}
		});

	}

	/**
	 * 获取缓存
	 */

	public Object getCached(final byte[] sessionId) throws Exception {
		return redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				byte[] bs = connection.get(sessionId);
				return SerializeUtil.unserialize(bs);
			}
		});

	}

	/**
	 * 根据 正则表达式key 获取 列表
	 */
	public Set getKeys(final byte[] keys) throws Exception {
		return redisTemplate.execute(new RedisCallback<Set>() {
			public Set doInRedis(RedisConnection connection)
					throws DataAccessException {
				Set<byte[]> setByte = connection.keys(keys);
				if (setByte == null || setByte.size() < 1) {
					return null;
				}
				Set set = new HashSet();
				for (byte[] key : setByte) {
					byte[] bs = connection.get(key);
					set.add(SerializeUtil.unserialize(bs));
				}

				return set;

			}
		});
	}
	/**
	 * 根据 正则表达式key 获取 列表
	 */
	public Set getHashKeys(final byte[] key) throws Exception {
		return (Set) redisTemplate.execute(new RedisCallback<Set>() {
			public Set doInRedis(RedisConnection connection)
					throws DataAccessException {
				Set<byte[]> hKeys = connection.hKeys(key);
				if(hKeys==null||hKeys.size()>1){
					return null;
				}
				Set set=new HashSet();
				for(byte[] bs:hKeys){
					set.add(SerializeUtil.unserialize(bs));
				}
			return set;
			}
		});

	}
	/**
	 * 更新 缓存
	 */
	public Boolean  updateHashCached(final byte[] key,final byte[] mapkey, final byte[] value, Long expire)
			throws Exception {
	
		return redisTemplate.execute(new RedisCallback<Boolean>() {
			public Boolean doInRedis(RedisConnection connection)
					throws DataAccessException {
				Boolean hSet = connection.hSet(key, mapkey, value);
				return hSet;
			}
		});
	}
	
	/**
	 * 获取缓存
	 */
	public Object getHashCached(final byte[] key, final byte[] mapkey) throws Exception {
		return redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				byte[] hGet = connection.hGet(key, mapkey);
				return SerializeUtil.unserialize(hGet);

			}
		});
	}
	
	/**
	 * 删除 缓存
	 */
	public Long deleteHashCached(final byte[] key, final byte[] mapkey) throws Exception {
		return redisTemplate.execute(new RedisCallback<Long>() {
			public Long doInRedis(RedisConnection connection)
					throws DataAccessException {
				Long hDel = connection.hDel(key, mapkey);
				return hDel;

			}
		});
	}
	/**
	 * 获取 map的长度
	 */
	public Long getHashSize(final byte[] key) throws Exception {
		return redisTemplate.execute(new RedisCallback<Long>() {
			public Long doInRedis(RedisConnection connection)
					throws DataAccessException {
				Long len = connection.hLen(key);
				return len;

			}
		});
	}

	/**
	 * 获取 map的长度
	 */
	public Long getDBSize() throws Exception {
		return redisTemplate.execute(new RedisCallback<Long>() {
			public Long doInRedis(RedisConnection connection)
					throws DataAccessException {
				Long len = connection.dbSize();
				
				return len;

			}
		});
	}

	/**
	 * 清除缓存
	 */
	public void clearDB() throws Exception {
		 redisTemplate.execute(new RedisCallback<Long>() {
			public Long doInRedis(RedisConnection connection)
					throws DataAccessException {
				  connection.flushDb();
				return null;

			}
		});
	}
	
	public RedisTemplate<String, Object> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	public int getExpire() {
		return expire;
	}

	public void setExpire(int expire) {
		this.expire = expire;
	}

	/**
	 * 获取 map中的所有值
	 */
	public List getHashValues(final byte[] key) throws Exception {
		return redisTemplate.execute(new RedisCallback<List>() {
			public List doInRedis(RedisConnection connection)
					throws DataAccessException {
				 List<byte[]> hVals = connection.hVals(key);
				
				 if(hVals==null||hVals.size()<1){
					 return null;
				 }
				 List list=new ArrayList();
				 
				 for(byte[] bs:hVals){
					 list.add(SerializeUtil.unserialize(bs));
				 }
				return list;

			}
		});
	}
}
