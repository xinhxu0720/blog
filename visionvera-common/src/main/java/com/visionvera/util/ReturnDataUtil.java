package com.visionvera.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.visionvera.bean.base.ReturnData;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准的接口返回数据格式解析工具类
 *
 */
public class ReturnDataUtil {
	/**
	 * 将返回的数据类型为ReturnData的extra数据解析成JSONObject
	 * @param returnData
	 * @return
	 */
	public static JSONObject getExtraJsonObject(ReturnData returnData) {
		JSONObject roleJsonObject = JSONObject.parseObject(JSONObject.toJSONString(returnData), JSONObject.class);
		JSONObject extraJsonObject = roleJsonObject.getJSONObject("data").getJSONObject("extra");
		return extraJsonObject;
	}
	
	/**
	 * 将返回的数据类型为ReturnData的extra数据解析成需要的对象
	 * @param returnData
	 * @param reponseObject
	 * @return
	 */
	public static <T> T getExtraJsonObject(ReturnData returnData, Class<T> reponseObject) {
		JSONObject roleJsonObject = JSONObject.parseObject(JSONObject.toJSONString(returnData), JSONObject.class);
		JSONObject extraJsonObject = roleJsonObject.getJSONObject("data").getJSONObject("extra");
		
		if (extraJsonObject != null && extraJsonObject.size() > 0) {
			T resultObject = JSONObject.parseObject(extraJsonObject.toJSONString(), reponseObject);
			return resultObject;
		}
		
		return null;
	}
	
	/**
	 * 将返回的数据类型为ReturnData的items数据解析成需要的对象列表
	 * @param returnData 
	 * @param responseObject
	 * @return
	 */
	public static <T> List<T> getItemsList(ReturnData returnData, Class<T> responseObject) {
		List<T> responseList = new ArrayList<>();
		JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(returnData), JSONObject.class);
		JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("items");
		
		if (jsonArray != null && jsonArray.size() > 0) {
			responseList = jsonArray.toJavaList(responseObject);
		}
		
		return responseList;
	}
}
