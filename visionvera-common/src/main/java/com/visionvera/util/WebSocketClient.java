package com.visionvera.util;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/**
 * 连接WebSocket服务端工具
 *
 */
public class WebSocketClient {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	private WebSocket webSocket = null;
	
	/** WebSocket连接的超时时间 */
	private long webSocketTimeout = 5000;

	public WebSocket getWebSocket() {
		return webSocket;
	}

	public void setWebSocket(WebSocket webSocket) {
		this.webSocket = webSocket;
	}
	
	/** 监听器类 */
	class WebSocketClientListener extends WebSocketListener {
		
		@Override
		public void onOpen(WebSocket webSocket, Response response) {
			super.onOpen(webSocket, response);
		}
		
		@Override
		public void onMessage(WebSocket webSocket, String text) {
			super.onMessage(webSocket, text);
			System.out.println("返回的消息内容是: [" + text + "]");
			LOGGER.info("返回的消息内容是: [" + text + "]");
		}
		
		@Override
		public void onClosing(WebSocket webSocket, int code, String reason) {
			super.onClosing(webSocket, code, reason);
			LOGGER.info("关闭连接。关闭原因: [" + reason + "]");
		}
		
		@Override
		public void onFailure(WebSocket webSocket, Throwable t, Response response) {
			super.onFailure(webSocket, t, response);
			LOGGER.error("失败的连接", t);
		}
	}
	
	/**
	 * 建立连接
	 * @param url WebSocket地址。例如ws://localhost:8080/cmsweb
	 */
	private void connection(String url) {
		Request request = new Request.Builder().url(url).build();//请求体
		
		OkHttpClient client = new OkHttpClient.Builder().readTimeout(this.webSocketTimeout, TimeUnit.SECONDS).build();

		webSocket = client.newWebSocket(request, new WebSocketClientListener());
	}
	
	/**
	 * 发送消息
	 * @param message 消息实体。JSON格式的数据
	 */
	public void sendMessage(String url, String message) {
		this.connection(url);//建立连接,发送消息
		webSocket.send(message);//发送消息
		webSocket.close(1000, "正常关闭");
	}
}
