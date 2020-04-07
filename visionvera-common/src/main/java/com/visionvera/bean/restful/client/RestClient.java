package com.visionvera.bean.restful.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.visionvera.constrant.WsConstants;

import javax.net.ssl.*;

public class RestClient {
	
	private static final Logger logger = LoggerFactory.getLogger(RestClient.class);
	/**
	 * 
	 * @author 谢程算
	 * @date 2017年2月8日  
	 * @version 1.0.0 
	 * @param url
	 * @param token
	 * @param args
	 */
	public static Map<String, Object> get(String url, String token, Map<String, Object> args) {
		String result = "";
		System.setProperty("http.keepAlive", "false");
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			logger.info("GET方式调用远端webservice方法：" + url +";参数：" + args);
//			if ("https".equals(url.substring(0, 5))) {
//				try {
//					TrustManager[] tms = {new X509TrustManager() {
//						@Override
//						public void checkClientTrusted(X509Certificate certificates[], String authType) {
//						}
//
//						@Override
//						public void checkServerTrusted(X509Certificate[] ax509certificate, String s) {
//						}
//
//						@Override
//						public X509Certificate[] getAcceptedIssuers() {
//							return null;
//						}
//					}};
//					SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
//					sslContext.init(null, tms, new SecureRandom());
//					//从上述SSLContext对象中得到SSLSocketFactory对象
//
//					HostnameVerifier ignoreHostnameVerifier = (s, sslsession) -> {
//						System.out.println("WARNING: Hostname is not matched for cert.");
//						logger.error("访问HTTPS远端服务器失败: 主机名验证失败");
//						return true;
//					};
//					HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
//					HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
//
//				} catch (Exception e) {
//					logger.error("访问HTTPS远端服务器失败: ", e);
//				}
//			}
			URL restServiceURL = new URL(linkUrl(url, token, args)); 
			HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL
					.openConnection();
			httpConnection.setConnectTimeout(6000);//超时时间（毫秒）
			httpConnection.setReadTimeout(18000);//读取超时
			httpConnection.setRequestMethod(WsConstants.METHOD_GET);
			httpConnection.setRequestProperty(WsConstants.PROP_CONTENT_TYPE, WsConstants.PROP_CONTENT_JSON);
			httpConnection.setRequestProperty(WsConstants.PROP_ACCEPT, WsConstants.PROP_ACCEPT_JSON);

			if (httpConnection.getResponseCode() != 200) {
				resultMap.put("errcode", 1);
				resultMap.put("errmsg", "访问远端服务器失败，错误码：" + httpConnection.getResponseCode());
				logger.error("访问远端服务器失败: errorcode " + httpConnection.getResponseCode());
				return resultMap;
			}

			BufferedReader responseBuffer = new BufferedReader(
					new InputStreamReader(httpConnection.getInputStream(),"utf-8"));

			String output;
			while ((output = responseBuffer.readLine()) != null) {
				result += output; 
			}
			httpConnection.disconnect();
//			resultMap.put("errcode", 0);
//			resultMap.put("errmsg", "操作成功");
			logger.info("GET方式调用远端webservice方法：" + url +";参数：" + args + "；返回值: " + result);
		} catch (MalformedURLException e) {
			resultMap.put("errcode", 1);
			resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		} catch (IOException e) {
			resultMap.put("errcode", 1);
			if(e instanceof ConnectException || e instanceof SocketTimeoutException){
				resultMap.put("errmsg", "访问远端服务器失败，连接超时");
			}else{
				resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			}
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		}
		return json2Map(result, resultMap);
	}
	
	/**
	 * 
	 * @author 谢程算
	 * @date 2017年2月8日  
	 * @version 1.0.0 
	 * @param <T>
	 * @param url
	 * @return
	 */
	public static <T> Map<String, Object> post(String url, String token, T args) {
		String result = "";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			logger.info("POST方式调用远端webservice方法：" + url + "；参数: " + args);
			/*if ("https".equals(url.substring(0, 5))) {
				try {
					TrustManager[] tms = {new X509TrustManager() {
						@Override
						public void checkClientTrusted(X509Certificate certificates[], String authType) {
						}

						@Override
						public void checkServerTrusted(X509Certificate[] ax509certificate, String s) {
						}

						@Override
						public X509Certificate[] getAcceptedIssuers() {
							return null;
						}
					}};
					SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
					sslContext.init(null, tms, new SecureRandom());
					//从上述SSLContext对象中得到SSLSocketFactory对象

					HostnameVerifier ignoreHostnameVerifier = (s, sslsession) -> {
						System.out.println("WARNING: Hostname is not matched for cert.");
						logger.error("访问HTTPS远端服务器失败: 主机名验证失败");
						return true;
					};
					HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
					HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

				} catch (Exception e) {
					logger.error("访问HTTPS远端服务器失败: ", e);
				}
			}*/
			URL targetUrl = new URL(linkUrl(url, token, null));
			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl
					.openConnection();
			httpConnection.setConnectTimeout(6000);//连接超时时间（毫秒）
			httpConnection.setReadTimeout(18000);//读取超时
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod(WsConstants.METHOD_POST);
			httpConnection.setRequestProperty(WsConstants.PROP_CONTENT_TYPE, WsConstants.PROP_CONTENT_JSON);
//			httpConnection.setRequestProperty(WsConstants.PROP_ACCEPT, WsConstants.PROP_ACCEPT_JSON);
			String json = null;
			if(args != null){
				json = JSONObject.toJSONString(args); //保留map中值为null的属性
				logger.info("json =======================" +json);
				OutputStream outputStream = httpConnection.getOutputStream();
				outputStream.write(json.getBytes("utf-8"));
				outputStream.flush();
			}
			if (httpConnection.getResponseCode() != 200) {
				resultMap.put("errcode", 1);
				resultMap.put("errmsg", "访问远端服务器失败，错误码：" + httpConnection.getResponseCode());
				logger.error("访问远端服务器失败: errorcode " + httpConnection.getResponseCode());
				return resultMap;
			}
			
			BufferedReader responseBuffer = new BufferedReader(
					new InputStreamReader(httpConnection.getInputStream(),"utf-8"));
			String output;
			while ((output = responseBuffer.readLine()) != null) {
				result += output; 
			}
			httpConnection.disconnect();
//			resultMap.put("errcode", 0);
//			resultMap.put("errmsg", "操作成功");
			logger.info("POST方式调用远端webservice方法：" + targetUrl + "；参数: " + json + "；返回值: " + result);
		} catch (MalformedURLException e) {
			resultMap.put("errcode", 1);
			resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		} catch (IOException e) {
			resultMap.put("errcode", 1);
			if(e instanceof ConnectException || e instanceof SocketTimeoutException){
				resultMap.put("errmsg", "访问远端服务器失败，连接超时");
			}else{
				resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			}
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		}
		return json2Map(result, resultMap);
	}

	/**
	 * 
	 * @author 谢程算
	 * @date 2017年2月8日  
	 * @version 1.0.0 
	 * @param <T>
	 * @param url
	 * @return
	 */
	public static <T> Map<String, Object> post(String url, String token, T args, Map<String, Object> urlArgs) {
		String result = "";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			logger.info("POST方式调用远端webservice方法：" + url + "；参数: " + urlArgs);
			if ("https".equals(url.substring(0, 5))) {
				try {
					TrustManager[] tms = {new X509TrustManager() {
						@Override
						public void checkClientTrusted(X509Certificate certificates[], String authType) {
						}

						@Override
						public void checkServerTrusted(X509Certificate[] ax509certificate, String s) {
						}

						@Override
						public X509Certificate[] getAcceptedIssuers() {
							return null;
						}
					}};
					SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
					sslContext.init(null, tms, new SecureRandom());
					//从上述SSLContext对象中得到SSLSocketFactory对象

					HostnameVerifier ignoreHostnameVerifier = (s, sslsession) -> {
						System.out.println("WARNING: Hostname is not matched for cert.");
						logger.error("访问HTTPS远端服务器失败: 主机名验证失败");
						return true;
					};
					HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
					HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

				} catch (Exception e) {
					logger.error("访问HTTPS远端服务器失败: ", e);
				}
			}
			URL targetUrl = new URL(linkUrl(url, token, urlArgs));
			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl
					.openConnection();
			httpConnection.setConnectTimeout(6000);//连接超时时间（毫秒）
			httpConnection.setReadTimeout(18000);//读取超时
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod(WsConstants.METHOD_POST);
			httpConnection.setRequestProperty(WsConstants.PROP_CONTENT_TYPE, WsConstants.PROP_CONTENT_JSON);
//			httpConnection.setRequestProperty(WsConstants.PROP_ACCEPT, WsConstants.PROP_ACCEPT_JSON);
			String json = null;
			if(args != null){
				json = JSONObject.toJSONString(args, SerializerFeature.WriteMapNullValue); //保留map中值为null的属性
				OutputStream outputStream = httpConnection.getOutputStream();
				outputStream.write(json.getBytes("utf-8"));
				outputStream.flush();
			}
			
			if (httpConnection.getResponseCode() != 200) {
				resultMap.put("errcode", 1);
				resultMap.put("errmsg", "访问远端服务器失败，错误码：" + httpConnection.getResponseCode());
				logger.error("访问远端服务器失败: errorcode " + httpConnection.getResponseCode());
				return resultMap;
			}
			
			BufferedReader responseBuffer = new BufferedReader(
					new InputStreamReader(httpConnection.getInputStream(),"utf-8"));
			String output;
			while ((output = responseBuffer.readLine()) != null) {
				result += output; 
			}
			httpConnection.disconnect();
//			resultMap.put("errcode", 0);
//			resultMap.put("errmsg", "操作成功");
			logger.info("POST方式调用远端webservice方法：" + targetUrl + "；参数: " + json + "；返回值: " + result);
		} catch (MalformedURLException e) {
			resultMap.put("errcode", 1);
			resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		} catch (IOException e) {
			resultMap.put("errcode", 1);
			if(e instanceof ConnectException || e instanceof SocketTimeoutException){
				resultMap.put("errmsg", "访问远端服务器失败，连接超时");
			}else{
				resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			}
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		}
		return json2Map(result, resultMap);
	}
	/**
	 * 
	 * url带参数
	 * @return
	 */
	public static <T> Map<String, Object> postUrl(String url, String token, Map<String, Object> args) {
		String result = "";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			logger.info("POST调用远端webservice方法：" + url + "；参数: " + args);
			if ("https".equals(url.substring(0, 5))) {
				try {
					TrustManager[] tms = {new X509TrustManager() {
						@Override
						public void checkClientTrusted(X509Certificate certificates[], String authType) {
						}

						@Override
						public void checkServerTrusted(X509Certificate[] ax509certificate, String s) {
						}

						@Override
						public X509Certificate[] getAcceptedIssuers() {
							return null;
						}
					}};
					SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
					sslContext.init(null, tms, new SecureRandom());
					//从上述SSLContext对象中得到SSLSocketFactory对象

					HostnameVerifier ignoreHostnameVerifier = (s, sslsession) -> {
						System.out.println("WARNING: Hostname is not matched for cert.");
						logger.error("访问HTTPS远端服务器失败: 主机名验证失败");
						return true;
					};
					HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
					HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

				} catch (Exception e) {
					logger.error("访问HTTPS远端服务器失败: ", e);
				}
			}
			URL targetUrl = new URL(linkUrl(url, token, args));
			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl
					.openConnection();
			httpConnection.setConnectTimeout(6000);//连接超时时间（毫秒）
			httpConnection.setReadTimeout(18000);//读取超时
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod(WsConstants.METHOD_POST);
			httpConnection.setRequestProperty(WsConstants.PROP_CONTENT_TYPE, WsConstants.PROP_CONTENT_JSON);
//			httpConnection.setRequestProperty(WsConstants.PROP_ACCEPT, WsConstants.PROP_ACCEPT_JSON);
			String json = null;
			if(args != null){
				json = JSONObject.toJSONString(args, SerializerFeature.WriteMapNullValue); //保留map中值为null的属性
				OutputStream outputStream = httpConnection.getOutputStream();
				outputStream.write(json.getBytes("utf-8"));
				outputStream.flush();
			}
			
			if (httpConnection.getResponseCode() != 200) {
				resultMap.put("errcode", 1);
				resultMap.put("errmsg", "访问远端服务器失败，错误码：" + httpConnection.getResponseCode());
				logger.error("访问远端服务器失败: errorcode " + httpConnection.getResponseCode());
				return resultMap;
			}
			
			BufferedReader responseBuffer = new BufferedReader(
					new InputStreamReader(httpConnection.getInputStream(),"utf-8"));
			String output;
			while ((output = responseBuffer.readLine()) != null) {
				result += output; 
			}
			httpConnection.disconnect();
//			resultMap.put("errcode", 0);
//			resultMap.put("errmsg", "操作成功");
			logger.info("POST调用远端webservice方法：" + targetUrl + "；参数: " + json + "；返回值: " + result);
		} catch (MalformedURLException e) {
			resultMap.put("errcode", 1);
			resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		} catch (IOException e) {
			resultMap.put("errcode", 1);
			if(e instanceof ConnectException || e instanceof SocketTimeoutException){
				resultMap.put("errmsg", "访问远端服务器失败，连接超时");
			}else{
				resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			}
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		}
		return json2Map(result, resultMap);
	}

	/**
	 * 
	 * @author 谢程算
	 * @date 2017年2月8日  
	 * @version 1.0.0 
	 * @param <T>
	 * @param url
	 * @return
	 */
	public static <T> Map<String, Object> postTest(String url, String pathParam, String auth) {
		String result = "";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			System.out.println(("Post 发送消息：url " + url+ ",参数：" + pathParam));
//			URL targetUrl = new URL(linkUrl2(url, pathParam));
//			URL targetUrl = new URL(url);
			URL targetUrl = new URL(linkUrl2(url, pathParam));
			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl
					.openConnection();
			httpConnection.setConnectTimeout(600000);//连接超时时间（毫秒）
			httpConnection.setReadTimeout(600000);//读取超时
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod(WsConstants.METHOD_POST);
			httpConnection.setRequestProperty(WsConstants.PROP_CONTENT_TYPE, "application/x-www-form-urlencoded;charset=utf-8");//application/x-www-form-urlencoded;charset=utf-8
//			httpConnection.setRequestProperty(WsConstants.PROP_ACCEPT, WsConstants.PROP_ACCEPT_JSON);
			if(auth != null){
				OutputStream outputStream = httpConnection.getOutputStream();
				outputStream.write(auth.getBytes("utf-8"));
				outputStream.flush();
			}
			
			if (httpConnection.getResponseCode() != 200) {
				resultMap.put("errmsg", "访问远端服务器失败，错误码：" + httpConnection.getResponseCode());
				resultMap.put("code", 1);
				logger.error("访问远端服务器失败: errorcode " + httpConnection.getResponseCode());
				return resultMap;
			}
			
			BufferedReader responseBuffer = new BufferedReader(
					new InputStreamReader(httpConnection.getInputStream(),"utf-8"));
			String output;
			while ((output = responseBuffer.readLine()) != null) {
				result += output; 
			}
			httpConnection.disconnect();
			logger.info("调用远端webservice方法：" + url + "；参数: " + pathParam + "；返回值: " + result);
		} catch (MalformedURLException e) {
			resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			resultMap.put("code", 1);
			logger.error("访问远端服务器失败: ", e);
			
			return resultMap;
		} catch (IOException e) {
			if(e instanceof ConnectException || e instanceof SocketTimeoutException){
				resultMap.put("errmsg", "访问远端服务器失败，连接超时");
				resultMap.put("code", 1);
			}else{
				resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
				resultMap.put("code", 1);
			}
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		}
		return json2Map(result, resultMap);
	}
	
	
	/**
	 * 褚英奇
	 * @param url
	 * @param pathParam
	 * @param auth
	 * @return
	 */
	public static <T> Map<String, Object> postJG(String url, String pathParam,String header) {
		String result = "";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			System.out.println(("Post 发送消息：url " + url+ ",参数：" + pathParam));
//			URL targetUrl = new URL(linkUrl2(url, pathParam));
			URL targetUrl = new URL(url);
//			URL targetUrl = new URL(linkUrl2(url, pathParam));
			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl
					.openConnection();
			//httpConnection
			httpConnection.setRequestProperty("Authorization", header);
			httpConnection.setConnectTimeout(600000);//连接超时时间（毫秒）
			httpConnection.setReadTimeout(600000);//读取超时
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod(WsConstants.METHOD_POST);
			httpConnection.setRequestProperty(WsConstants.PROP_CONTENT_TYPE, "application/x-www-form-urlencoded;charset=utf-8");//application/x-www-form-urlencoded;charset=utf-8
//			httpConnection.setRequestProperty(WsConstants.PROP_ACCEPT, WsConstants.PROP_ACCEPT_JSON);
//			if(auth != null){
//				OutputStream outputStream = httpConnection.getOutputStream();
//				outputStream.write(auth.getBytes("utf-8"));
//				outputStream.flush();
//			}
			
			if (httpConnection.getResponseCode() != 200) {
				resultMap.put("errmsg", "访问远端服务器失败，错误码：" + httpConnection.getResponseCode());
				logger.error("访问远端服务器失败: errorcode " + httpConnection.getResponseCode());
				return resultMap;
			}
			
			BufferedReader responseBuffer = new BufferedReader(
					new InputStreamReader(httpConnection.getInputStream(),"utf-8"));
			String output;
			while ((output = responseBuffer.readLine()) != null) {
				result += output; 
			}
			httpConnection.disconnect();
			logger.info("调用远端webservice方法：" + url + "；参数: " + pathParam + "；返回值: " + result);
		} catch (MalformedURLException e) {
			resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		} catch (IOException e) {
			if(e instanceof ConnectException || e instanceof SocketTimeoutException){
				resultMap.put("errmsg", "访问远端服务器失败，连接超时");
			}else{
				resultMap.put("errmsg", "访问远端服务器失败，系统内部异常");
			}
			logger.error("访问远端服务器失败: ", e);
			return resultMap;
		}
		return json2Map(result, resultMap);
	}
	/**in
	 * 
	 * @author 谢程算
	 * @date 2017年2月8日  
	 * @version 1.0.0 
	 * @param url
	 * @param token
	 * @param args
	 * @return
	 */
	private static String linkUrl(String url, String token, Map<String, Object> args){
		Set<String> keySet = null;
		if(args != null){
			keySet = args.keySet();
		}
		if(StringUtils.isNotBlank(token)){
			url += "?" + WsConstants.KEY_TOKEN + "=" + token;
		}
		if(keySet != null){
			for(String key : keySet){
				url += "&" + key + "=" + args.get(key);
			}
		}
		//统一添加“微服务”标识
		url += "&microServerFlag=1";
		
		if(StringUtils.isBlank(token) && url.indexOf("?") < 0){
			url = url.replaceFirst("&", "?");
		}
		return url;
	}
	
	private static String linkUrl2(String url, String token){
		if(StringUtils.isNotBlank(token)){
			url += "&" + "json_data" + "=" + token;
		}
		return url;
	}
	
	/**
	 * json字符串转换成map
	 * @author 谢程算
	 * @date 2017年2月8日  
	 * @version 1.0.0 
	 * @param json
	 * @param resultMap 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static Map<String, Object> json2Map(String json, Map<String, Object> resultMap){
		Map<String, Object> map = new HashMap<String, Object>();
		ObjectMapper mapper = new ObjectMapper();
		try {
			map = mapper.readValue(json, Map.class);
//			map.putAll(resultMap);
		} catch (Exception e) {
			logger.error("远端服务器获取的数据转换成Map时失败: ", e);
			map.put("errcode", 1);
			map.put("errmsg", "返回结果异常");
			map.put("result", false);
			map.put("msg", "返回结果异常");
		}
		return map;
	}
}
