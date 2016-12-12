package org.andy.pay.sso.shiro;

import org.andy.pay.sso.cached.ICached;
import org.apache.shiro.cache.AbstractCacheManager;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;


/**
 * shrio缓存管理
 *
 */
public class ShiroRedisCacheManager extends AbstractCacheManager {
	private ICached cached;
	
	/**
	 * 创建缓存
	 */
	@Override
	protected Cache createCache(String cacheName) throws CacheException {
		return new ShiroRedisCache<String, Object>(cacheName,cached);
	}
	public ICached getCached() {
		return cached;
	}
	public void setCached(ICached cached) {
		this.cached = cached;
	}

}
