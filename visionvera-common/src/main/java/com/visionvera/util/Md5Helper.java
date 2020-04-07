package com.visionvera.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//import sun.misc.BASE64Encoder;

public class Md5Helper {
	public static String EncoderByMd5(String str)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String digest = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] hash = md.digest(str.getBytes("UTF-8"));

			// converting byte array to Hexadecimal String
			StringBuilder sb = new StringBuilder(2 * hash.length);
			for (byte b : hash) {
				sb.append(String.format("%02x", b & 0xff));
			}
			digest = sb.toString();
		} catch (UnsupportedEncodingException ex) {
			// Logger.getLogger(StringReplace.class.getName()).log(Level.SEVERE,
			// null, ex);
		} catch (NoSuchAlgorithmException ex) {
			// Logger.getLogger(StringReplace.class.getName()).log(Level.SEVERE,
			// null, ex);
		}
		return digest;
	}

}