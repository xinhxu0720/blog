package com.visionvera.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * 类的描述. 
 * @author 陈婷
 * @version   1.0.1  
 *
 */
public class AesUtils {
	private static final Logger logger = LogManager.getLogger(AesUtils.class);
//	private static String aesIv = "gfdertfghjkuyrtg";
//	private static String aesKey = "asdfwetyhjuytrfd";
	private static String aesIv = "W@34*bHb#cUcd%d7";
	private static String aesKey = "1V3$5T78*23M5a7^";
	private static final String CHARSET_UTF8 = "UTF-8";

	
	
	/**
	 * 功能的简述. 
	 * <br>修改历史：
	 * <br>修改日期  修改者 BUG小功能修改申请单号
	 *
	 * @param args
	 * 注意：
	 * @throws Exception 
	 */

	public static void main(String[] args) throws Exception {
		String test = "{\"result\":true,\"list\":[{\"createtime\":1504513056000,\"email\":\"\",\"fromApp\":0,\"isLocked\":0,\"mobilephone\":\"13718187045\",\"realname\":\"admin\",\"status\":0,\"userid\":1,\"username\":\"admin\",\"version\":0}],\"msg\":\"查询成功\"}";
		String abc = "dK9VhsdJBI7GKXajhskHNMjmXKasuFOmWv8o91CpZDU4/64Og+qDV4Ro4RS04AqQ";
		System.out.println(encrypt(test));
		System.out.println(abc);
		String c = decrypt(abc);
		System.out.println(c);
//		String d = decrypt(c);
//		System.out.println(d);
		
		
	}
	
	/**
	 * 功能的简述. AES加密，然后再base64加密
	 * <br>修改历史：
	 * <br>修改日期  修改者 BUG小功能修改申请单号
	 *
	 * @param content  需要加密的内容
	 * @param sKey  密钥
	 * @return 加密后的内容
	 * @throws NoSuchPaddingException 
	 * @throws NoSuchAlgorithmException 
	 * @throws InvalidAlgorithmParameterException 
	 * @throws InvalidKeyException 
	 * @throws BadPaddingException 
	 * @throws IllegalBlockSizeException 
	 * @throws UnsupportedEncodingException 
	 * @throws Exception
	 * 注意：
	 */
	public static String encrypt(String content) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException{
		byte[] raw = aesKey.getBytes(CHARSET_UTF8);
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// "算法/模式/补码方式"
		IvParameterSpec iv = new IvParameterSpec(aesIv.getBytes(CHARSET_UTF8));// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
		byte[] encrypted = cipher.doFinal(content.getBytes(CHARSET_UTF8));

		String mm = Base64.encodeBase64String(encrypted);

		return mm;// 此处使用BASE64做转码功能，同时能起到2次加密的作用。

	}

	/**
	 * 功能的简述. base64解密，然后再AES解密 
	 * <br>修改历史：
	 * <br>修改日期  修改者 BUG小功能修改申请单号
	 *
	 * @param content 需要解密的内容
	 * @param sKey 密钥
	 * @return 解密后的内容
	 * @throws UnsupportedEncodingException 
	 * @throws UnsupportedEncodingException 
	 * @throws NoSuchPaddingException 
	 * @throws NoSuchAlgorithmException 
	 * @throws NoSuchPaddingException 
	 * @throws NoSuchAlgorithmException 
	 * @throws InvalidAlgorithmParameterException 
	 * @throws InvalidKeyException 
	 * @throws InvalidAlgorithmParameterException 
	 * @throws InvalidKeyException 
	 * @throws Exception
	 * 注意：
	 */
	public static String decrypt(String content) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException{
		
		int len = (content == null) ? 0 : content.length();
		if(len == 0){
			logger.error("AesUtils-----decrypt------content is null!");
			return null;
		}
		// 自动将被替换的“+”重新补回
		content = content.replaceAll(" ", "+");
		// 自动将被替换的“=”重新补回
		len = content.length();
		if(len % 4 != 0){
			for(int i = 0; i < 4 - (len % 4); i++){
				content += "=";
			}
		}
		logger.info("AesUtils-----decrypt------content----" + content);
		byte[] raw = aesKey.getBytes();
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		IvParameterSpec iv = new IvParameterSpec(aesIv.getBytes(CHARSET_UTF8));
		cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

		//content = content.trim().replaceAll(" ", "+");
		byte[] encrypted1 = Base64.decodeBase64(content.getBytes(CHARSET_UTF8));

		try {
			byte[] original = cipher.doFinal(encrypted1);
			for(int i = 0; i < original.length; i++) {
				//System.out.print((char)original[i] + ", ");
			}
			String originalString = new String(original, CHARSET_UTF8);
			return originalString;
		} catch (Exception e) {
			logger.error("AesUtils-----decrypt------"+e.toString(),e);
			return null;
		}
	}
}
