package com.visionvera.bean.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseReturn {
	/**
	 * 返回成功
	 * @param errcode 状态码。0表示成功，1表示失败
	 * @param errmsg 提示信息
	 * @return
	 */
	public ReturnData returnResult(int errcode, String errmsg) {
		ReturnData returnData = new ReturnData();
		returnData.setErrcode(errcode);
		returnData.setErrmsg(errmsg);
		return returnData;
	}
	
	/**
	 * 只返回成功状态码和状态信息
	 * @param errmsg 状态信息
	 * @return
	 */
	public ReturnData returnSuccess(String errmsg) {
		return this.returnResult(0, errmsg);
	}
	
	/**
	 * 只返回状态码为1和状态信息
	 * @param errmsg 状态信息
	 * @return
	 */
	public ReturnData returnError(String errmsg) {
		return this.returnResult(1, errmsg);
	}
	
	/**
	 * 返回状态码+状态信息+access_token
	 * @param errcode 状态码
	 * @param errmsg 状态信息
	 * @param accessToken access_token
	 * @return
	 */
	public ReturnData returnResult(int errcode, String errmsg, String accessToken) {
		ReturnData dataResult = this.returnResult(errcode, errmsg);
		dataResult.setAccess_token(accessToken);
		return dataResult;
	}
	
	/**
	 * 返回状态码+提示信息+access_token+列表数据
	 * @param errcode 状态码
	 * @param errmsg 提示信息
	 * @param accessToken access_token
	 * @param itemList 列表数据
	 * @return
	 */
	public <T> ReturnData returnResult(int errcode, String errmsg, String accessToken, T itemList) {
		ReturnData dataResult = this.returnResult(errcode, errmsg, accessToken);

		dataResult.setData(itemList);
		return dataResult;
	}
	
	/**
	 * 返回状态码+提示信息+access_token+列表数据+其他数据
	 * @param errcode 状态码
	 * @param errmsg 提示信息
	 * @param accessToken access_token
	 * @param itemList 列表数据
	 * @param extraData 其他数据
	 * @return
	 */
	public ReturnData returnResult(int errcode, String errmsg, String accessToken, List<?> itemList, Object extraData) {
		ReturnData dataResult = this.returnResult(errcode, errmsg, accessToken);
		
		Map<String, Object> itemMap = new HashMap<String, Object>();
		itemMap.put("items", itemList);
		itemMap.put("extra", extraData);
		dataResult.setData(itemMap);
		
		return dataResult;
	}
	
	
}
