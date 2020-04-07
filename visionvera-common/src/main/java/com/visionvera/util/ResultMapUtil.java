package com.visionvera.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回Map
 *
 */
public class ResultMapUtil {
	/**
	 * 获取结果Map
	 * @param errcode 为0表示成功，为1表示失败
	 * @param errmsg 提示信息
	 * @return
	 */
	public static Map<String, Object> getResultMap(Integer errcode, String errmsg){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("errcode", errcode);
		resultMap.put("errmsg", errmsg);
		return resultMap;
	}
	
	/**
	 * 获取结果Map
	 * @param errcode 为0表示成功，为1表示失败
	 * @param errmsg 提示信息
	 * @param accessToken 访问令牌
	 * @return
	 */
	public static Map<String, Object> getResultMap(Integer errcode, String errmsg, String accessToken){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = getResultMap(errcode, errmsg);
		resultMap.put("access_token", accessToken);
		return resultMap;
	}
	
	/**
	 * 获取结果Map
	 * @param errcode 为0表示成功，为1表示失败
	 * @param errmsg 提示信息
	 * @param itemList 封装列表数据信息
	 * @return
	 */
	public static Map<String, Object> getResultMap(Integer errcode, String errmsg, List<?> itemList) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> itemMap = new HashMap<String, Object>();//列表Map
		resultMap = getResultMap(errcode, errmsg);
		itemMap.put("items", itemList);
		resultMap.put("data", itemMap);
		return resultMap;
	}
	
	/**
	 * 获取结果Map
	 * @param errcode 为0表示成功，为1表示失败
	 * @param errmsg 提示信息
	 * @param itemList 封装列表数据信息
	 * @param extra 封装其他参数信息
	 * @return
	 */
	public static Map<String, Object> getResultMap(Integer errcode, String errmsg, List<?> itemList, Object extra) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> dataMap = new HashMap<String, Object>();//数据Map
		resultMap = getResultMap(errcode, errmsg);
		dataMap.put("extra", extra);
		dataMap.put("items", itemList);
		resultMap.put("data", dataMap);
		return resultMap;
	}
	
	/**
	 * 直接返回错误信息：{"errcode":"1","errmsg":"错误"}
	 * @param errmsg 错误的提示信息
	 * @return
	 */
	public static Map<String, Object> getResultMapError(String errmsg) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = getResultMap(1, errmsg);
		return resultMap;
	}
}
