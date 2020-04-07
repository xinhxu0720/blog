package com.visionvera.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	/** 手机号正则表达式 */
	private static final String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";

	/** 预编译正则表达式 */
	private static final Pattern phonePattern = Pattern.compile(regex);

	public static String null2Empty(String str) {
		return str == null ? "" : str;
	}

	public static String null2Empty(Object str) {
		return str == null ? "" : str.toString();
	}

	/**
	 * 判断字符串是否为空或空串
	 * 
	 * @param param
	 *            字符串
	 * @return true表示为空或空串，false表示不为空
	 */
	public static boolean isNull(String param) {
		if (param == null || param.length() == 0) {
			return true;
		}

		return false;
	}

	/**
	 * 判断字符串不为空或者空串
	 * 
	 * @param param
	 * @return true表示不为空或者空串，false表示为空或空串
	 */
	public static boolean isNotNull(String param) {
		if (param != null && param.length() > 0) {
			return true;
		}

		return false;
	}

	/**
	 * 生成32位UUID，去除中间的"-"
	 * 
	 * @return
	 */
	public static String get32UUID() {
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}

	/**
	 * 生成36位UUID
	 * 
	 * @return
	 */
	public static String get36UUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 将短位的字符串在末尾补0转换成长位的字符串
	 * @param input 输入的字符串
	 * @param completeLength 要转换的长度
	 * @return 补0后的字符串
	 */
	public static String getCompleteString(String input, int completeLength) {
		if (StringUtils.isBlank(input)) {
			return input;
		} else {
			StringBuilder postfixStringBuilder = new StringBuilder();
			String completeString = "";
			for (int i = 0; i < (completeLength - input.length()); i++) {
				postfixStringBuilder.append(0);
			}
			completeString = input + postfixStringBuilder.toString();
			return completeString;
		}


	}

	/**
	 * 获取随机数字字母混合字符串，可以指定位数
	 *
	 * <br>
	 * 2015-01-13 xiujinyue 15772小功能增改/passport_手机注册用户默认昵称修改
	 * 
	 * @param num
	 *            需要的字符个数
	 * @return
	 */
	public static String getRandomStrAndNum(int num) {
		String[] random = { "a", "b", "c", "d", "e", "f", "g", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "h",
				"i", "g", "k", "l", "m", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
		return getRandomStr(random, num);
	}

	/**
	 * 获取随机字符串，可以指定位数
	 *
	 * <br>
	 * 2015-01-13 xiujinyue 15772小功能增改/passport_手机注册用户默认昵称修改
	 * 
	 * @param random
	 *            种子
	 * @param num
	 *            需要的字符个数
	 * @return
	 */
	public static String getRandomStr(String[] random, int num) {
		int count = 0;
		String str = "";
		num = num > random.length ? random.length : num;
		for (int i = 0; i < num; i++) {
			count = getRandomNum(0, random.length - 1);
			str += random[count];
		}
		return str;
	}

	/**
	 * 生成指定范围的随机数 （含min，max）
	 * 
	 * @param min
	 *            起始值
	 * @param max
	 *            结束值
	 * @return 返回包括起始值和结束值在内的随机整数
	 */
	public static int getRandomNum(int min, int max) {
		return (int) ((Math.random() * (max - min + 1) + min));
	}

	/**
	 * 判断是否为数字 <br>
	 * 修改历史： <br>
	 * 修改日期 修改者 BUG小功能修改申请单号 <br>
	 * 
	 * @param str_input
	 *            要进行判断的字符串
	 * @return boolean;符合为true,不符合为false 注意：
	 */
	public static boolean isNumeric(String str_input) {
		if (isNull(str_input)) {
			return false;
		}
		if (str_input.matches("\\d*")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 去除字符串后缀
	 * @param str
	 * @param suffix
	 * @return
	 */
	public static String removeSuffix(String str, String suffix) {
        if (str.contains(suffix)) {
            return str.substring(0, str.lastIndexOf(suffix));
        } else {
            return str;
        }
    }

	/**
	 * 拼写Redis的Key
	 *
	 * @param prefix
	 *            前缀
	 * @param postfix
	 *            后缀
	 * @return prefix_postfix
	 */
	public static String getRedisKey(String prefix, String postfix) {
		return prefix + "_" + postfix;
	}

	/**
	 * 检查手机号是否是正确的
	 * @param phone
	 * @return
	 */
	public static boolean isCorrectPhone(String phone) {
		Matcher matcher = phonePattern.matcher(phone);
		boolean isMatcher = matcher.matches();
		return isMatcher;
	}
	
	  /**
     * 
     * @Description 检查是否包含中文字符
     * @param str
     * @return
     * boolean
     */
    public static boolean isContainChinese(String str) {

        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }
}
