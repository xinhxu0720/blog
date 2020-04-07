package com.visionvera.exception;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * 异常基类
 * 
 * @author Bianjf
 *
 */
public class BaseException extends RuntimeException implements Serializable {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	private static final long serialVersionUID = 4426416610311255445L;

	/**
	 * 异常代码
	 */
	private String code;

	/**
	 * 错误码对应的参数
	 */
	private Object[] args;

	/**
	 * 错误消息
	 */
	private String defaultMessage;

	public String getCode() {
		return code;
	}

	public Object[] getArgs() {
		return args;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	/**
	 * 构造基础异常
	 * 
	 * @param code
	 *            异常代码
	 * @param args
	 *            异常参数
	 * @param defaultMessage
	 *            默认异常消息
	 * @param cause
	 *            引起此异常的触发异常
	 */
	public BaseException(String code, Object[] args, String defaultMessage, Throwable cause) {
		super(cause);
		this.code = code;
		this.args = args;
		this.defaultMessage = defaultMessage;

	}

	/**
	 * 构造基础异常
	 * 
	 * @param code
	 *            异常代码
	 * @param args
	 *            异常参数
	 * @param defaultMessage
	 *            默认异常消息
	 */
	public BaseException(String code, Object[] args, String defaultMessage) {
		this(code, args, defaultMessage, null);
	}

	/**
	 * 构造基础异常
	 * 
	 * @param defaultMessage
	 *            默认异常消息
	 * @param cause
	 *            引起此异常的触发异常
	 */
	public BaseException(String defaultMessage, Throwable cause) {
		this(null, null, defaultMessage, cause);
	}

	/**
	 * 构造基础异常
	 * 
	 * @param defaultMessage
	 *            默认异常消息
	 */
	public BaseException(String defaultMessage) {
		this(null, null, defaultMessage, null);
	}

	/**
	 * 
	 * 构造基础异常
	 * 
	 * @param code
	 *            异常代码
	 * @param args
	 *            异常参数
	 * @param cause
	 *            引起此异常的触发异常
	 */
	public BaseException(String code, Object[] args, Throwable cause) {
		this(code, args, null, cause);
	}

	/**
	 * 
	 * 构造基础异常
	 * 
	 * @param code
	 *            异常代码
	 * @param args
	 *            异常参数
	 */
	public BaseException(String code, Object[] args) {
		this(code, args, null, null);
	}

	@Override
	public String getMessage() {
		String message = null;
		try {
			if (!StringUtils.isEmpty(code)) {
				message = MessageUtils.message(code, args);
			}
		} catch (Exception e) {
			logger.warn("Can't convert message from properties", e);
			message = defaultMessage;
		}
		if (message == null) {
			message = defaultMessage;
		}
		return message;
	}

	@Override
	public String toString() {
		return this.getClass() + "{" + ", message='" + getMessage() + '\'' + '}';
	}
}
