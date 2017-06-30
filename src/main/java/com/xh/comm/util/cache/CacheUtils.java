package com.xh.comm.util.cache;

import redis.clients.jedis.Jedis;
/**
 * 
 * @author yuq
 * @date 2017年6月30日
 * @todo 连接Resis和对数据和缓存和取
 */
public class CacheUtils {

	public  CacheUtils cache;
	public Jedis jedis;
	public CacheUtils(){
		jedis =  new Jedis("103.45.7.37",6379);
	}
	public  CacheUtils(String ip,int port){
		jedis =  new Jedis("103.45.7.37",6379);
	}
	public CacheUtils getInstance(){
		if(cache==null){
			cache = new CacheUtils();
		}
		return cache;
	}
	public  Jedis getj(){
		return jedis;
	}
	
}
