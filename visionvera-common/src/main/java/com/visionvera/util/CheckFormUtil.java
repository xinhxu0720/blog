package com.visionvera.util;

import java.util.regex.Matcher;  
import java.util.regex.Pattern;  
  
/** 
 * 验证常用表单内容是否合法
 *  
 * @author      : zhangh
 * @Version     : 1.00 
 * @Date        : 2019-10-23
 */  
public class CheckFormUtil {  
      

	/**
	 * 验证手机号码
	 * @Description TODO
	 * @author zhangh
	 * @param mobileNumber
	 * @return
	 * boolean
	 */
	public static boolean checkMobileNumber(String mobileNumber) {
		boolean flag = false;
		try {
			Pattern regex = Pattern.compile("^(13[0-9]|14[4-9]|15[0-3,5-9]|16[6]|17[0-1,3-8]|18[0-9]|19[89])\\d{8}$");
			Matcher matcher = regex.matcher(mobileNumber);
			flag = matcher.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	/**
	 * 验证邮箱
	 * @Description TODO
	 * @author zhangh
	 * @param mobileNumber
	 * @return
	 * boolean
	 */
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
		    String check = "^[-a-z0-9~!$%^&*_=+}{\\'?]+(\\.[-a-z0-9~!$%^&*_=+}{\\'?]+)*@([a-z0-9_][-a-z0-9_]*(\\.[-a-z0-9_]+)*\\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})?$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(email);
			flag = matcher.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	/**
	 * 验证端口号
	 * @Description TODO
	 * @author zhangh
	 * @param checkPort
	 * @return
	 * boolean
	 */
	public static boolean checkPort(String port) {
		boolean flag = false;
		try {
		    String check = "^([1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]{1}|6553[0-5])$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(port);
			flag = matcher.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	/**
	 * 验证端口号
	 * @Description TODO
	 * @author zhangh
	 * @param checkPort
	 * @return
	 * boolean
	 */
	public static boolean checkIp(String ip) {
		boolean flag = false;
		try {
			String check = "^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(ip);
			flag = matcher.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	
	
	
	public static void main(String[] args) {
		String mobile ="12201082880";
		String email ="182@visionvera";
		String prot ="18200";
		String ip ="192.168.24.168";
		Boolean flag = checkMobileNumber(mobile);
		Boolean checkEmail =checkEmail(email);
		Boolean checkPort =checkPort(prot);
		Boolean checkIp =checkIp(ip);
		System.out.println(flag);
		System.out.println(checkEmail);
		System.out.println(checkPort);
		System.out.println(checkIp);
	}



}  
