package com.aptoto.thrift.exception;

/**
 * Description：<br> 
 * Thrift 自定义异常
 * @author  hgq
 * @date    2016年06月24日
 * 
 */
public class ThriftException extends Exception {
	private static final long serialVersionUID = -5274946244705035514L;

	public ThriftException() {
		super();
	}

	public ThriftException(String message, Throwable cause) {
		super(message, cause);
	}

	public ThriftException(String message) {
		super(message);
	}

	public ThriftException(Throwable cause) {
		super(cause);
	}
}


