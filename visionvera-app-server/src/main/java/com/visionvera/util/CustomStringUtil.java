package com.visionvera.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/**
 * 自定义工具类
 * @author wangrz
 * @date 2017年12月19日15:41:50
 *
 */
public class CustomStringUtil {

	/**
	 * 获取基础路径
	 * 
	 * @return
	 */
	public static String getBasePath() {
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		if (basePath.indexOf("webapps/") > 0) {
			basePath = basePath.substring(0, basePath.lastIndexOf("webapps/")) + "webapps/";
		}
		if (basePath.indexOf("%20") > 0) {
			basePath = basePath.replaceAll("%20", " ");
		}
		if(isLinux()) {
			return basePath;
		}
		//windows系统删除开头/
		basePath = basePath.substring(1,basePath.length());
		return basePath;
	}
	
	/**
	 * 判断当前系统
	 * @return
	 */
	public static boolean isLinux() 
	{
		boolean ret = false;
		String osname = System.getProperty("os.name");
		if (osname.toUpperCase().indexOf("WINDOWS") != -1) {
			ret = false;
		} else {
			ret = true;
		}
		return ret;
	}
	
	/**
	 * 获取文件MD5值
	 * @param file
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String getMd5(File file) throws FileNotFoundException {
        String value = null;
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            MappedByteBuffer byteBuffer = in.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(byteBuffer);
            BigInteger bi = new BigInteger(1, md5.digest());
            value = bi.toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return value;
    }
}
