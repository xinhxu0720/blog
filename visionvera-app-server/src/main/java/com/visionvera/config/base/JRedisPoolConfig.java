package com.visionvera.config.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPoolConfig;

/**
 * Jedis连接池配置信息
 *
 */
@Configuration
public class JRedisPoolConfig {
	/** 最大连接数 */
	@Value("${jedis.pool.config.max-total}")
	private Integer maxTotal;
	
	/** 最大空闲连接数 */
	@Value("${jedis.pool.config.max-idle}")
	private Integer maxIdle;
	
	/** 最大等待时间，如果超过等待时间，则抛出：JedisConnectionException */
	@Value("${jedis.pool.config.max-wait-millis}")
	private Long maxWaitMillis;
	
	/** 每次释放连接的最大数目 */
	@Value("${jedis.pool.config.num-tests-per-eviction-run}")
	private Integer numTestsPerEvictionRun;
	
	/** 释放连接的扫描间隔（毫秒） */
	@Value("${jedis.pool.config.time-between-eviction-runs-millis}")
	private Long timeBetweenEvictionRunsMillis;
	
	/** 连接最小空闲时间 */
	@Value("${jedis.pool.config.min-evictable-idle-time-millis}")
	private Long minEvictableIdleTimeMillis;
	
	/** 连接空闲多久后释放, 当空闲时间>该值 且 空闲连接>最大空闲连接数 时直接释放 */
	@Value("${jedis.pool.config.soft-min-evictable-idle-time-millis}")
	private Long softMinEvictableIdleTimeMillis;
	
	/** 在获取连接的时候检查有效性, 默认false */
	@Value("${jedis.pool.config.test-on-borrow}")
	private Boolean testOnBorrow;
	
	/** 在空闲时检查有效性, 默认false */
	@Value("${jedis.pool.config.test-while-idle}")
	private Boolean testWhileIdle;
	
	/** 连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true */
	@Value("${jedis.pool.config.block-when-exhausted}")
	private Boolean blockWhenExhausted;
	
	/**
	 * 配置Jedis连接池
	 * @return
	 */
	@Bean
	public JedisPoolConfig getJedisPoolConfig() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxTotal(this.maxTotal);
		jedisPoolConfig.setMaxIdle(this.maxIdle);
		jedisPoolConfig.setMaxWaitMillis(this.maxWaitMillis);
		jedisPoolConfig.setNumTestsPerEvictionRun(this.numTestsPerEvictionRun);
		jedisPoolConfig.setTimeBetweenEvictionRunsMillis(this.timeBetweenEvictionRunsMillis);
		jedisPoolConfig.setMinEvictableIdleTimeMillis(this.minEvictableIdleTimeMillis);
		jedisPoolConfig.setSoftMinEvictableIdleTimeMillis(this.softMinEvictableIdleTimeMillis);
		jedisPoolConfig.setTestOnBorrow(this.testOnBorrow);
		jedisPoolConfig.setTestWhileIdle(this.testWhileIdle);
		jedisPoolConfig.setBlockWhenExhausted(this.blockWhenExhausted);
		return jedisPoolConfig;
	}
}
