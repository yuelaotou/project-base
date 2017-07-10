/**
 * 
 */
package com.hebaobei.baby.common.exception;

/**
 * @author yangguang
 *
 */

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -8984848558761330684L;

	private Object[] parameters = null;

	public Object[] getParameters() {
		return parameters;
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Object... params) {
		super(message);
		this.parameters = params;
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(String message, Throwable cause, Object... params) {
		super(message, cause);
		this.parameters = params;
	}

	@Override
	public String getLocalizedMessage() {
		return super.getLocalizedMessage();
	}

}
