package com.visionvera.exception;

/**
 * 业务异常
 * 
 * @author Bianjf
 *
 */
public class BusinessException extends BaseException {

	private static final long serialVersionUID = 8853729593799137275L;

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
	public BusinessException(String code, Object[] args, String defaultMessage, Throwable cause) {
		super(code, args, defaultMessage, cause);
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
	public BusinessException(String code, Object[] args, String defaultMessage) {
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
	public BusinessException(String defaultMessage, Throwable cause) {
		this(null, null, defaultMessage, cause);
	}

	/**
	 * 构造基础异常
	 * 
	 * @param defaultMessage
	 *            默认异常消息
	 */
	public BusinessException(String defaultMessage) {
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
	public BusinessException(String code, Object[] args, Throwable cause) {
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
	public BusinessException(String code, Object[] args) {
		this(code, args, null, null);
	}

}
