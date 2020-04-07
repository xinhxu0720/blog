package com.visionvera.common.api.dispatchment;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Set;

public class RestTemplateUtil {
	/** 默认连接超时时间 */
	private static final Integer DEFAULT_CONNECT_TIMEOUT = 10000;
	/** 默认读取超时时间 */
	private static final Integer DEFAULT_READ_TIMEOUT = 10000;
	
	/**
	 * 获取RestTemplate
	 * @param connectTimeout 连接超时时间。为null则默认为10000毫秒
	 * @param readTimeout 读取超时时间。为null则默认为10000毫秒
	 * @return
	 */
	private static RestTemplate getRestTemplate(String url, Integer connectTimeout, Integer readTimeout) {
		SimpleClientHttpRequestFactory requestFactory = null;
		if ("https".equals(url.substring(0, 5))) {
			requestFactory = new HttpsClientRequestFactory();
		} else {
			requestFactory = new SimpleClientHttpRequestFactory();
		}
		
		if (connectTimeout == null || connectTimeout <= 0) {
			connectTimeout = DEFAULT_CONNECT_TIMEOUT;
		}
		
		if (readTimeout == null || readTimeout <= 0) {
			readTimeout = DEFAULT_READ_TIMEOUT;
		}
		requestFactory.setConnectTimeout(connectTimeout);
		requestFactory.setReadTimeout(readTimeout);
		
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		
		return restTemplate;
	}
	
	/**
	 * 获取请求头
	 * @param requestHeaderMap
	 * @return
	 */
	private static HttpHeaders getHttpHearders(Map<String, String> requestHeaderMap) {
		Set<String> keySet = null;
		HttpHeaders requestHeader = new HttpHeaders();
		
		if (requestHeaderMap != null && requestHeaderMap.size() > 0) {
			keySet = requestHeaderMap.keySet();
		}
		
		if (keySet != null && keySet.size() > 0) {
			for (String key : keySet) {
				requestHeader.set(key, requestHeaderMap.get(key));
			}
		}
		return requestHeader;
	}

	/**
	 * 将HashMap或者其他的Map转换成MultiValueMap
	 * @param requestMap 请求体的参数
	 * @return
	 */
	private static MultiValueMap getMultiValueMap(Map<String, String> requestMap) {
		MultiValueMap<String, String> request = new LinkedMultiValueMap<>();//在FORM表单等其他方式的请求中，请求体的参数必须是MultiValueMap(不能是HashMap或者其他)
		Set<String> keySet = null;
		if (requestMap != null && requestMap.size() > 0) {
			keySet = requestMap.keySet();
		}
		if (keySet != null && keySet.size() > 0) {
			for (String key : keySet) {
				request.add(key, requestMap.get(key));
			}
		}
		return request;
	}
	
	/**
	 * 发送请求
	 * @param url 请求URL
	 * @param request 请求体，GET方式没有请求体，为空
	 * @param method 请求类型。POST或者GET
	 * @param responseType 返回类型
	 * @param connectTimeout 连接超时时间
	 * @param readTimeout 读取超时时间
	 * @param requestHeaderMap 请求头
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	private static <T> T exchange(String url, Object request, HttpMethod method, Class<T> responseType, Integer connectTimeout, Integer readTimeout, Map<String, String> requestHeaderMap, Object ... uriVariables) {
		RestTemplate restTemplate = getRestTemplate(url, connectTimeout, readTimeout);//获取RestTemplate
		HttpEntity<Object> entity = new HttpEntity<Object>(request, getHttpHearders(requestHeaderMap));//获取请求体
		ResponseEntity<T> responseEntity = restTemplate.exchange(url, method, entity, responseType, uriVariables);//发送请求
		return responseEntity.getBody();
	}
	
	/**
	 * 发送请求
	 * @param url 请求URL
	 * @param request 请求体，GET方式没有请求体，为空
	 * @param method 请求类型。POST或者GET
	 * @param responseType 返回类型
	 * @param connectTimeout 连接超时时间
	 * @param readTimeout 读取超时时间
	 * @param requestHeaderMap 请求头
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	private static <T> T exchange(String url, Object request, HttpMethod method, Class<T> responseType, Integer connectTimeout, Integer readTimeout, Map<String, String> requestHeaderMap, Map<String, ?> uriVariables) {
		RestTemplate restTemplate = getRestTemplate(url, connectTimeout, readTimeout);//获取RestTemplate
		HttpEntity<Object> entity = new HttpEntity<Object>(request, getHttpHearders(requestHeaderMap));//获取请求体
		ResponseEntity<T> responseEntity = restTemplate.exchange(url, method, entity, responseType, uriVariables);//发送请求
		return responseEntity.getBody();
	}
	
	
	/**
	 * POST请求
	 * @param url 请求URL
	 * @param request 请求体
	 * @param responseType 返回类型
	 * @param connectTimeout 连接超时时间
	 * @param readTimeout 读取超时时间
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T postForObject(String url, Object request, Class<T> responseType, Integer connectTimeout, Integer readTimeout, Map<String, String> requestHeaderMap, Object ... uriVariables) {
		return exchange(url, request, HttpMethod.POST, responseType, connectTimeout, readTimeout, requestHeaderMap, uriVariables);
	}
	
	/**
	 * GET请求
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param connectTimeout 连接超时时间
	 * @param readTimeout 读取超时时间
	 * @param requestHeaderMap 请求头
	 * @param uriVariables URL的参数绑定，使用Map的Key绑定
	 * @return
	 */
	public static <T> T getForObject(String url, Class<T> responseType, Integer connectTimeout, Integer readTimeout, Map<String, String> requestHeaderMap, Object ... uriVariables) {
		return exchange(url, null, HttpMethod.GET, responseType, connectTimeout, readTimeout, requestHeaderMap, uriVariables);
	}

	/**
	 * DELETE请求
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param connectTimeout 连接超时时间
	 * @param readTimeout 读取超时时间
	 * @param requestHeaderMap 请求头
	 * @param uriVariables URL的参数绑定，使用Map的Key绑定
	 * @return
	 */
	public static <T> T deleteForObject(String url, Class<T> responseType, Integer connectTimeout, Integer readTimeout, Map<String, String> requestHeaderMap, Object ... uriVariables) {
		return exchange(url, null, HttpMethod.DELETE, responseType, connectTimeout, readTimeout, requestHeaderMap, uriVariables);
	}
	
	/**
	 * POST请求
	 * @param url 请求URL
	 * @param request 请求体
	 * @param responseType 返回类型
	 * @param connectTimeout 连接超时时间
	 * @param readTimeout 读取超时时间
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，Map中的Key占位绑定
	 * @return
	 */
	public static <T> T postForObject(String url, Object request, Class<T> responseType, Integer connectTimeout, Integer readTimeout, Map<String, String> requestHeaderMap, Map<String, ?> uriVariables) {
		return exchange(url, request, HttpMethod.POST, responseType, connectTimeout, readTimeout, requestHeaderMap, uriVariables);
	}
	
	/**
	 * POST请求
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param connectTimeout 连接超时时间
	 * @param readTimeout 读取超时时间
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，Map中的Key占位绑定
	 * @return
	 */
	public static <T> T getForObject(String url, Class<T> responseType, Integer connectTimeout, Integer readTimeout, Map<String, String> requestHeaderMap, Map<String, ?> uriVariables) {
		return exchange(url, null, HttpMethod.GET, responseType, connectTimeout, readTimeout, requestHeaderMap, uriVariables);
	}

	/**
	 * DELETE请求
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param connectTimeout 连接超时时间
	 * @param readTimeout 读取超时时间
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，Map中的Key占位绑定
	 * @return
	 */
	public static <T> T deleteForObject(String url, Class<T> responseType, Integer connectTimeout, Integer readTimeout, Map<String, String> requestHeaderMap, Map<String, ?> uriVariables) {
		return exchange(url, null, HttpMethod.DELETE, responseType, connectTimeout, readTimeout, requestHeaderMap, uriVariables);
	}
	
	/**
	 * POST请求. 默认的连接时间为10000, 默认的读取超时时间为10000
	 * @param url 请求URL
	 * @param request 请求体的数据
	 * @param responseType 返回类型
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，Map中的Key占位绑定
	 * @return
	 */
	public static <T> T postForObject(String url, Object request, Class<T> responseType, Map<String, String> requestHeaderMap, Object ... uriVariables) {
		return exchange(url, request, HttpMethod.POST, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, requestHeaderMap, uriVariables);
	}
	
	/**
	 * POST请求. 默认的连接时间为10000, 默认的读取超时时间为10000
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，Map中的Key占位绑定
	 * @return
	 */
	public static <T> T getForObject(String url, Class<T> responseType, Map<String, String> requestHeaderMap, Object ... uriVariables) {
		return exchange(url, null, HttpMethod.GET, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, requestHeaderMap, uriVariables);
	}

	/**
	 * DELETE请求. 默认的连接时间为10000, 默认的读取超时时间为10000
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，Map中的Key占位绑定
	 * @return
	 */
	public static <T> T deleteForObject(String url, Class<T> responseType, Map<String, String> requestHeaderMap, Object ... uriVariables) {
		return exchange(url, null, HttpMethod.DELETE, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, requestHeaderMap, uriVariables);
	}
	
	/**
	 * POST请求. 默认的连接时间为10000, 默认的读取超时时间为10000
	 * @param url 请求URL
	 * @param request 请求体的数据
	 * @param responseType 返回类型
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T postForObject(String url, Object request, Class<T> responseType, Map<String, String> requestHeaderMap, Map<String, ?> uriVariables) {
		return exchange(url, request, HttpMethod.POST, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, requestHeaderMap, uriVariables);
	}
	
	/**
	 * GET请求. 默认的连接时间为10000, 默认的读取超时时间为10000
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T getForObject(String url, Class<T> responseType, Map<String, String> requestHeaderMap, Map<String, ?> uriVariables) {
		return exchange(url, null, HttpMethod.GET, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, requestHeaderMap, uriVariables);
	}

	/**
	 * DELETE请求. 默认的连接时间为10000, 默认的读取超时时间为10000
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param requestHeaderMap 请求头Map
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T deleteForObject(String url, Class<T> responseType, Map<String, String> requestHeaderMap, Map<String, ?> uriVariables) {
		return exchange(url, null, HttpMethod.DELETE, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, requestHeaderMap, uriVariables);
	}
	
	/**
	 * GET请求。默认的连接时间为10000, 默认的读取超时时间为10000。默认的Header为空
	 * @param url 请求URL
	 * @param request 请求体的数据
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T postForObject(String url, Object request, Class<T> responseType, Object ... uriVariables) {
		return exchange(url, request, HttpMethod.POST, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, null, uriVariables);
	}
	
	/**
	 * GET请求。默认的连接时间为10000, 默认的读取超时时间为10000。默认的Header为空
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T getForObject(String url, Class<T> responseType, Object ... uriVariables) {
		return exchange(url, null, HttpMethod.GET, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, null, uriVariables);
	}

	/**
	 * DELETE请求。默认的连接时间为10000, 默认的读取超时时间为10000。默认的Header为空
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T deleteForObject(String url, Class<T> responseType, Object ... uriVariables) {
		return exchange(url, null, HttpMethod.DELETE, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, null, uriVariables);
	}
	
	/**
	 * GET请求。默认的连接时间为10000, 默认的读取超时时间为10000。默认的Header为空
	 * @param url 请求URL
	 * @param request 请求体的数据
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T postForObject(String url, Object request, Class<T> responseType, Map<String, ?> uriVariables) {
		return exchange(url, request, HttpMethod.POST, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, null, uriVariables);
	}
	
	/**
	 * GET请求。默认的连接时间为10000, 默认的读取超时时间为10000。默认的Header为空
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T getForObject(String url, Class<T> responseType, Map<String, ?> uriVariables) {
		return exchange(url, null, HttpMethod.GET, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, null, uriVariables);
	}

	/**
	 * DELETE请求。默认的连接时间为10000, 默认的读取超时时间为10000。默认的Header为空
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @return
	 */
	public static <T> T deleteForObject(String url, Class<T> responseType, Map<String, ?> uriVariables) {
		return exchange(url, null, HttpMethod.DELETE, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, null, uriVariables);
	}

	/**
	 * POST请求。通过表单的方式提交请求
	 * @param url 请求URL
	 * @param requestMap 请求体的Map数据
	 * @param responseType 返回类型
	 * @param <T>
	 * @return
	 */
	public static <T> T postForObjectByForm(String url, Map<String, String> requestMap, Class<T> responseType) {
		return exchange(url, getMultiValueMap(requestMap), HttpMethod.POST, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, HttpHeadMap.getFormRequestHeaderMap(), "");
	}

	/**
	 * GET请求。通过表单的方式提交请求
	 * @param url 请求URL
	 * @param requestMap 请求体的Map数据
	 * @param responseType 返回类型
	 * @param <T>
	 * @return
	 */
	public static <T> T getForObjectByForm(String url, Map<String, String> requestMap, Class<T> responseType) {
		return exchange(url, getMultiValueMap(requestMap), HttpMethod.GET, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, HttpHeadMap.getFormRequestHeaderMap(), "");
	}

	/**
	 * POST请求。通过表单的方式提交请求
	 * @param url 请求URL
	 * @param requestMap 请求体的Map数据
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @param <T>
	 * @return
	 */
	public static <T> T postForObjectByForm(String url, Map<String, String> requestMap, Class<T> responseType, Map<String, ?> uriVariables) {
		return exchange(url, getMultiValueMap(requestMap), HttpMethod.POST, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, HttpHeadMap.getFormRequestHeaderMap(), uriVariables);
	}

	/**
	 * POST请求。通过表单的方式提交请求
	 * @param url 请求URL
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @param <T>
	 * @return
	 */
	public static <T> T postForObjectByForm(String url, Class<T> responseType, Map<String, ?> uriVariables) {
		return exchange(url, null, HttpMethod.POST, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, HttpHeadMap.getFormRequestHeaderMap(), uriVariables);
	}

	/**
	 * GET请求。通过表单的方式提交请求
	 * @param url 请求URL
	 * @param requestMap 请求体的Map数据
	 * @param responseType 返回类型
	 * @param uriVariables URL的参数绑定，使用占位符绑定
	 * @param <T>
	 * @return
	 */
	public static <T> T getForObjectByForm(String url, Map<String, String> requestMap, Class<T> responseType, Map<String, ?> uriVariables) {
		return exchange(url, getMultiValueMap(requestMap), HttpMethod.GET, responseType, DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT, HttpHeadMap.getFormRequestHeaderMap(), uriVariables);
	}
}
