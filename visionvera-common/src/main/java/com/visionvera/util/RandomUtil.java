package com.visionvera.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomUtil {
	/**
	 * 生成随机数字和字母组合
	 * 
	 * @param length
	 *            表示生成几位随机数
	 * @return
	 */
	public static String getRandomChar(int length) {
		String val = "";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
			// 输出字母还是数字
			if ("char".equalsIgnoreCase(charOrNum)) {
				// 输出是大写字母还是小写字母
				// int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
				int temp = 97;// 只生成小写字母
				val += (char) (random.nextInt(26) + temp);
			} else if ("num".equalsIgnoreCase(charOrNum)) {
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}
	
	/**
	 * 生成随机数字组合
	 * 
	 * @param length
	 *            表示生成几位随机数
	 * @return
	 */
	public static String getRandomNum(int length) {
		String val = "";
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			val += String.valueOf(random.nextInt(10));
		}
		return val;
	}
	
	/**
	 * 
	 * TODO 获取会议编码（预约管理使用）
	 * @author 谢程算
	 * @date 2017年5月15日  
	 * @version 1.0.0 
	 * @param industryCode 行政编码
	 * @param areaCode 区域编码
	 * @return
	 */
	public static String getScheduleNum(String industryCode, String areaCode){
		Date nowTime = new Date(System.currentTimeMillis());
		SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyyMMdd");
		String strDate = sdFormatter.format(nowTime);
		return getRandomNum(5) + industryCode + strDate + areaCode;
	}
	
	public static void main(String[] args){
		System.out.println(getScheduleNum("ZZB","HB"));
	}
}
