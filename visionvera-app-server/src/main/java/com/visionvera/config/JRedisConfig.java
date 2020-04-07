package com.visionvera.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis单机对象和集群对象配置
 *
 */
@Configuration
public class JRedisConfig {
	/** 自动注入, 该配置信息在 com.visionvera.config.base.JRedisPoolConfig已经配置了JedisPoolConfig */
	@Autowired
	private JedisPoolConfig jedisPoolConfig;
	
	/** Jedis单机版地址 */
	@Value("${jedis.single.host}")
	private String jedisSingleHost;
	
	/** Jedis单机版端口号 */
	@Value("${jedis.single.port}")
	private Integer jedisSinglePort;
	
	/** Jedis集群版主机地址-01 */
	@Value("${jedis.cluster.host01}")
	private String JedisClusterHost01;
	
	/** Jedis集群版主机端口号-01 */
	@Value("${jedis.cluster.port01}")
	private Integer jedisClusterPort01;
	
	/** Jedis集群版主机地址-02 */
	@Value("${jedis.cluster.host02}")
	private String JedisClusterHost02;
	
	/** Jedis集群版主机端口号-02 */
	@Value("${jedis.cluster.port02}")
	private Integer jedisClusterPort02;
	
	/**
	 * 配置Jedis单机版操作对象
	 * @return
	 */
	@Bean
	public JedisPool getJedisPool() {
		JedisPool jedisPool = new JedisPool(jedisPoolConfig, jedisSingleHost, jedisSinglePort);
		return jedisPool;
	}
	
	/**
	 * 配置Jedis集群版操作对象
	 * 	如果是集群版的话，将@Bean放开
	 * @return
	 */
	/*@Bean*/
	public JedisCluster getJedisCluster() {
		Set<HostAndPort> nodeSet = new HashSet<>();//Jedis集群主机端口集合
		HostAndPort hostAndPort01 = new HostAndPort(this.JedisClusterHost01, this.jedisClusterPort01);
		HostAndPort hostAndPort02 = new HostAndPort(this.JedisClusterHost02, this.jedisClusterPort02);
		nodeSet.add(hostAndPort01);
		nodeSet.add(hostAndPort02);
		JedisCluster jedisCluster = new JedisCluster(nodeSet, jedisPoolConfig);
		return jedisCluster;
	}

}
