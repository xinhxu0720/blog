package com.visionvera.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;


public class SocketServer {
	
	private static final Logger logger = LogManager.getLogger(SocketServer.class);
	public void run(){
		new Thread(new AcceptSocketThread()).start();
	}

	class AcceptSocketThread implements Runnable{
		private ServerSocket serverSocket;
		private Socket socket;
		private int port = 5055;
		
		public AcceptSocketThread(){
		}
		
		public void run() {
			try {
				serverSocket = new ServerSocket(port);
				while (true) {
					socket = serverSocket.accept();
					new Thread(new SocketThread(socket)).start(); // 多线程阻塞
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * 处理socket连接
	 */
	class SocketThread implements Runnable {

		//AlarmController alarmController;
		private Socket socket;

		public SocketThread(Socket socket) {
			this.socket = socket;
			//alarmController = new AlarmController();
		}

		@SuppressWarnings("unused")
		public void run() {
			Map<String, Object> result = new HashMap<String, Object>();
			try {

				Reader reader = new InputStreamReader(socket.getInputStream(), "utf-8");
				Writer writer = new OutputStreamWriter(socket.getOutputStream());
				CharBuffer charBuffer = CharBuffer.allocate(10240000);
				int readIndex = -1;
				while ((readIndex = reader.read(charBuffer)) != -1) {
					charBuffer.flip();
					if(charBuffer.toString().indexOf("{")!=-1){
						Map<String, Object> map = JSON.parseObject(charBuffer.toString());
						@SuppressWarnings("unchecked")
						Map<String, Object> data = (Map<String, Object>) map.get("content");
						if(Integer.parseInt(map.get("cmd").toString()) == VSMeet.VMS_MEETING_START){
							logger.info("收到调度服务器的会议开启/停止提醒：" + charBuffer.toString());
							if(data.get("status") == null){
								return;
							}
							String message;
							if(data.get("status").toString().equals("1")){//status为1表示开启会议；为0表示停止会议
								logger.info("收到调度服务器的会议开启提醒：" + charBuffer.toString());
								message = "4";
							}else{
								logger.info("收到调度服务器的会议停止提醒：" + charBuffer.toString());
								message = "5";
							}
							/*SysConfigService sysConfigService = (SysConfigService) SpringContextUtil.getBean("sysConfigServiceImpl");
							//Map<String, Object> meetCount = alarmController.getAlarmMeetCount();
							ConstDataVO dataVO = new ConstDataVO();
							dataVO.setValueType(6);
							List<ConstDataVO> aprTime = sysConfigService.getAprTime(dataVO);
							if (aprTime == null || aprTime.size() == 0 ) {
								return;
							}*/
						}
					}
				}
			} catch (IOException e) {
				logger.error("调度服务请求处理失败： " + e);
				e.printStackTrace();
			} finally {
				if (socket != null) {
					if (!socket.isClosed()) {
						try {
							socket.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
