package com.visionvera.util;

/**
 * 对象的工具类
 * @author Bianjf
 *
 */
public class ObjectUtil {
	/**
	 * 批量将对象的值置为空
	 * @param objects
	 */
	public static void closeObject(Object ... objects) {
		for (Object object : objects) {
			if (object != null) {
				object = null;
			}
		}
	}
}
