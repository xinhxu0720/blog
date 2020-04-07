package com.visionvera.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.SortingParams;

/**
 * 操作Redis的接口
 *
 */
public interface JRedisDao {
	/**
	 * 获取数据 字符串
	 * 
	 * @param key
	 * @return
	 */
	public String get(String key);

	/**
	 * 设置数据 字符串
	 * 
	 * @param key
	 * @return
	 */
	public void set(String key, String value, int seconds);

	/**
	 * 当key不存在时，赋值
	 * 
	 * @param key
	 * @param value
	 * @param seconds
	 */
	public void setnx(String key, String value, int seconds);

	/**
	 * 将给定 key 的值设为 value ，并返回 key 的旧值(old value) 当 key 存在但不是字符串类型时，返回一个错误
	 * 
	 * @param key
	 * @param value
	 */
	public String getSet(String key, String value);

	/**
	 * 自动递增，增值为1
	 * 
	 * @param key
	 */
	public void incr(String key);

	/**
	 * 自定义增值
	 * 
	 * @param key
	 * @param scope
	 */
	public void incrBy(String key, long scope);

	/**
	 * 自定义减值
	 * 
	 * @param key
	 * @param scope
	 */
	public void descBy(String key, long scope);

	/**
	 * 一次性设置多个key-value
	 * 
	 * @param keysvalues
	 */
	public void mset(String... keysvalues);

	/**
	 * 一次性获取多个值
	 * 
	 * @param keys
	 * @return
	 */
	public List<String> mget(String... keys);

	/**
	 * 在原来基础上追加
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public long appendString(String key, String value);
	
	/**
	 * 获取hash数据
	 * 
	 * @param key
	 * @param field
	 * @return
	 */
	public String hget(String key, String field);

	/**
	 * 设置hash数据
	 * 
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 */
	public void hset(String key, String field, String value);

	/**
	 * 删除散列中的字段
	 * 
	 * @param key
	 * @param fields
	 */
	public void hdel(String key, String... fields);

	/**
	 * 设置多个散列数据
	 * 
	 * @param key
	 * @return
	 */
	public void hmset(String key, Map<String, String> value);

	/**
	 * 获取多个散列数据
	 * 
	 * @param key
	 * @param fields
	 * @return
	 */
	public List<String> hmget(String key, String... fields);

	/**
	 * 当key中的field不存在时，给对应的key键中field字段赋值
	 * 
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 */
	public long hsetnx(String key, String field, String value);

	/**
	 * 获取所有的散列信息
	 * 
	 * @param key
	 * @return Map<String, String>
	 */
	public Map<String, String> hgetAll(String key);

	/**
	 * 判断key键中是否存在某字段
	 * 
	 * @param key
	 * @param field
	 * @return
	 */
	public boolean hexists(String key, String field);

	/**
	 * 字段值增加/减小
	 * 
	 * @param key
	 * @param field
	 * @param increment
	 */
	public void hincyBy(String key, String field, long increment);

	/**
	 * 获取该key中所有的字段
	 * 
	 * @param key
	 * @return
	 */
	public Set<String> hkeys(String key);

	/**
	 * 获取该key中字段的所有值
	 * 
	 * @param key
	 * @return
	 */
	public List<String> hvals(String key);
	
	/**
	 * 从左边添加列表信息lpush
	 * 
	 * @param key
	 * @param values
	 * @return
	 */
	public void lpush(String key, String... values);

	/**
	 * 从右边添加列表信息rpush
	 * 
	 * @param key
	 * @param value
	 */
	public void rpush(String key, String... value);

	/**
	 * 从左侧删除列表信息
	 * 
	 * @param key
	 * @return
	 */
	public String lpop(String key);

	/**
	 * 从右删除列表信息
	 * 
	 * @param key
	 * @return
	 */
	public String rpop(String key);

	/**
	 * 删除列表中指定的值
	 * 
	 * @param key
	 * @param count
	 *            1.当count > 0,从列表左边开始删除前count个值为value的元素 2.当count <
	 *            0,从列表右边开始删除前|count|个值为value的元素 3.当count = 0,删除所有值为value的元素。
	 * @param value
	 * @return
	 */
	public long lrem(String key, long count, String value);

	/**
	 * 获取列表长度
	 * 
	 * @param key
	 * @return
	 */
	public long llen(String key);

	/**
	 * 获取列表片段
	 * 
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public List<String> lrange(String key, long start, long end);

	/**
	 * 获取指定索引的元素
	 * 
	 * @param key
	 * @param index
	 * @return
	 */
	public String lindex(String key, long index);

	/**
	 * 设置指定索引的元素
	 * 
	 * @param key
	 * @param index
	 * @param value
	 */
	public void lset(String key, long index, String value);

	/**
	 * 保留列表指定片段
	 * 
	 * @param key
	 * @param start
	 * @param end
	 */
	public void ltrim(String key, long start, long end);

	/**
	 * 在指定值的前或后插入新元素
	 * 
	 * @param key
	 * @param where
	 *            1. before:插入值在pivot之前 2. after:插入值在pivot之后
	 * @param pivot
	 * @param value
	 */
	public void linsert(String key, String where, String pivot, String value);

	/**
	 * 在此添加方法说明
	 * 
	 * @param key
	 * @param value
	 * @return void
	 */
	public void rpushObject(String key, Object... value);

	/**
	 * 在此添加方法说明
	 * 
	 * @param key
	 * @return Object
	 */
	public Object lpopObject(String key);
	
	/**
	 * 为key续期 <br>
	 * <font color=red>默认用户没访问超过30分钟注销用户的登录状态，所以用户每次访问都要将用户的注销时间推迟30分钟</font>
	 * 
	 * @param key
	 * @param expiry
	 *            有效期，单位秒
	 * @return long
	 */
	public long setKeyExpiry(String key, int expire);

	/**
	 * 删除数据
	 * 
	 * @param key
	 * @return
	 */
	public void del(String key);

	/**
	 * 将Set集合存入redis
	 * 
	 * @param key
	 * @param set
	 * @param seconds
	 * @return void
	 */
	public void setSet(String key, Set<Object> set, int seconds);

	/**
	 * 获取Redis中的Set集合
	 * 
	 * @param key
	 * @param set
	 * @param seconds
	 * @return void
	 */
	public Set<Object> getSet(String key);

	/**
	 * 删除redis中存储的set
	 * 
	 * @param key
	 */
	public void delSet(String key);

	/**
	 * 将List集合存入redis
	 * 
	 * @param key
	 * @param list
	 * @param seconds
	 * @return void
	 */
	public <T> void setList(String key, List<T> list, int seconds);

	/**
	 * 获取Redis中的List
	 * 
	 * @param key
	 * @return List<Object>
	 */
	public List<Object> getList(String key);

	/**
	 * 删除redis中存储的list
	 * 
	 * @param key
	 */
	public void delList(String key);

	/**
	 * 存储object对象
	 * 
	 * @param key
	 * @param object
	 * @param seconds
	 * @return void
	 */
	public void setObject(String key, Object object, int seconds);

	/**
	 * 获取redis中的object对象
	 * 
	 * @param key
	 * @return Object
	 */
	public Object getObject(String key);

	/**
	 * 删除redis中的object
	 * 
	 * @param key
	 * @return void
	 */
	public long delObject(String key);

	/**
	 * 正则匹配键
	 * 
	 * @param pattern
	 * @return
	 */
	public Set<String> keys(String pattern);

	/**
	 * 判断key键是否存在
	 * 
	 * @param key
	 * @return
	 */
	public boolean exists(String key);

	/**
	 * 根据key排序
	 * 
	 * @param key
	 * @return List<String>
	 */
	public List<String> sort(String key);

	/**
	 * 自定义排序
	 * 
	 * @param key
	 * @param sortingParams
	 * @return
	 */
	public List<String> sort(String key, SortingParams sortingParams);
	
	/**
	 * 单个添加元素到有序集合中
	 * 
	 * @param key
	 * @param score
	 * @param member
	 * @return
	 */
	public long zadd(String key, double score, String member);
}
