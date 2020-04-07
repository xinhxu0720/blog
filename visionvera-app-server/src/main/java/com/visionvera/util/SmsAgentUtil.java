/*
package com.visionvera.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.visionvera.bean.cms.SmsVO;
import com.visionvera.service.SmsService;

*/
/**
 * 
* <p>Title: SmsAgent</p>
* <p>Description: 统一的短信发送代理，提供webservice供其它项目调用</p>
* <p>Company: visionvera</p> 
* @author 谢程算
* @date 2017年3月29日
 *//*

public class SmsAgentUtil extends Thread{
	private static final Logger logger = LoggerFactory.getLogger(SmsAgentUtil.class);
	
	private String phones = null;
	private String msg = null;
	
	public SmsAgentUtil(String phones, String msg){
		this.phones = phones;
		this.msg = msg;
	}
	*/
/**
	 * 通过get方式发送短信
	 * @author 谢程算
	 * @date 2017年3月29日  
	 * @version 1.0.0
	 *//*

	public static int get(String phones, String msg){
		URL url = null;
		try {
			SmsService sms = (SmsService) SpringContextUtil.getBean("smsService");
			SmsVO server = sms.getSms();
			if(server == null){
				logger.info("短信服务未配置");
				return 11;//短信服务未配置
			}
			if(server.getStatus() != 2){
				logger.info("短信服务未启用");
				return 12;//短信服务未启用
			}
			if(StringUtils.isBlank(msg)){
				logger.info("短信内容为空");
				return -2;//短信内容为空
			}
			if(StringUtils.isBlank(phones)){
				logger.info("手机号为空");
				return -4;//手机号为空
			}
			logger.info("给" + phones + "发送短信，内容：" + msg);
			msg = java.net.URLEncoder.encode(msg,server.getEncode()); 
			*/
/*url = new URL(
					"http://jiekou.56dxw.com/sms/HttpInterfaceMore.aspx?comid=61&username=test106"
					+ "&userpwd=test106aaq&handtel="+phones+"&sendcontent="+msg
					+ "&smsnumber=10690");*//*

			url = new URL(
					server.getUrl()+"?comid="+server.getCid()+"&username="+server.getLoginName()
							+ "&userpwd="+server.getLoginPwd()+"&handtel="+phones+"&sendcontent="+msg
							+ "&smsnumber="+server.getOwner());
			HttpURLConnection httpCon;
			httpCon = (HttpURLConnection) url.openConnection();
			httpCon.connect();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					httpCon.getInputStream(),"GBK"));
			String line = in.readLine();
			System.out.println("result:   " + line);
			int ret = httpCon.getResponseCode();
			logger.info("给" + phones + "发送短信返回码为" + ret + "。");
			return ret; 
		} catch (Exception e) {
			logger.error("给" + phones + "发送短信失败：", e);
			return 13;//系统内部异常
		}
	}
	
	*/
/**
	 * 通过post方式发送短信
	 * @author 谢程算
	 * @date 2017年3月29日  
	 * @version 1.0.0
	 *//*

	public static int post(String phones, String msg) {
		URL url = null;
        try {
        	SmsService sms = (SmsService) SpringContextUtil.getBean("smsService"); 
			SmsVO server = sms.getSms();
			if(server == null){
				logger.info("短信服务未配置");
				return 11;//短信服务未配置
			}
			if(server.getStatus() != 2){
				logger.info("短信服务未启用");
				return 12;//短信服务未启用
			}
			if(StringUtils.isBlank(msg)){
				logger.info("短信内容为空");
				return -2;//短信内容为空
			}
			if(StringUtils.isBlank(phones)){
				logger.info("手机号为空");
				return -4;//手机号为空
			}
			logger.info("给" + phones + "发送短信，内容：" + msg);
			msg = java.net.URLEncoder.encode(msg, server.getEncode()); 
//            url = new URL(server.getUrl());
            url = new URL(server.getUrl());
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");// 提交模式
            // conn.setConnectTimeout(10000);//连接超时 单位毫秒
            // conn.setReadTimeout(2000);//读取超时 单位毫秒
            // 发送POST请求必须设置如下两行
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            // 发送请求参数
            String post = "comid="+server.getCid()+"&username="+server.getLoginName()
					+ "&userpwd="+server.getLoginPwd()+"&handtel="+phones+"&sendcontent="+msg
					+ "&smsnumber="+server.getOwner();
//            String post = "comid=3179&username=visionvera_sms"
//					+ "&userpwd=v2v!@#$qsd&handtel=" + phones + "&sendcontent="+msg
//					+ "&smsnumber=10690";
            printWriter.write(post);//post的参数 xx=xx&yy=yy
            // flush输出流的缓冲
            printWriter.flush();
            //开始获取数据
            BufferedInputStream bis = new BufferedInputStream(httpURLConnection.getInputStream());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len;
            byte[] arr = new byte[1024];
            while((len=bis.read(arr))!= -1){
                bos.write(arr,0,len);
                bos.flush();
            }
            bos.close();
            logger.info("给" + phones + "发送短信返回码为" + bos + "。");
            return Integer.parseInt(bos.toString("utf-8"));
        } catch (Exception e) {
        	logger.error("给" + phones + "发送短信失败：", e);
        	return 13;//系统内部异常
        }
	}

	public void run() {
		post(this.phones, this.msg);
	}
}
*/
