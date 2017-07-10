/**
 * 
 */
package com.hebaobei.baby.web.config;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import com.hebaobei.baby.common.exception.BusinessException;

/**
 * @author yangguang
 *
 */
@ControllerAdvice
public class AdviceConfig {
	private static final Logger logger = LoggerFactory.getLogger(AdviceConfig.class);

	@ExceptionHandler(value = { Exception.class })
	protected ResponseEntity<String> handleException(Exception ex, HttpServletRequest request) {
		logger.error("系统出现异常，详情：", ex);
		// 如果是ajax提交，则返回ResponseEntity信息给前台
		if (isAjaxSumbit(request)) {
			if (ex instanceof BusinessException) {
				return new ResponseEntity<String>(ex.getMessage(), HttpStatus.EXPECTATION_FAILED);
			} else {
				return new ResponseEntity<String>("系统异常！请联系管理员。", HttpStatus.EXPECTATION_FAILED);
			}
		} else {// 如果是非ajax提交，则直接抛出异常，由spring-web.xml中配置的拦截器，跳转到error/uncaught页面，展示exception
			throw new BusinessException("系统异常！请联系管理员。");
		}
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	/**
	 * 判断是否为ajax提交
	 * 
	 * @param request
	 * @return
	 */
	private boolean isAjaxSumbit(HttpServletRequest request) {

		String submitType = request.getHeader("X-Requested-With");
		if (submitType == null || "".equals(submitType)) {
			submitType = request.getParameter("submit-type");
		}
		return "XMLHttpRequest".equals(submitType);
	}
}
