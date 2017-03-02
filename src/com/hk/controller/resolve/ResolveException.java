package com.hk.controller.resolve;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.hk.exception.LoginException;

public class ResolveException implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		ModelAndView modelAndView = new ModelAndView();

		String message = null;
		LoginException loginException = null;
		if (ex instanceof LoginException) {
			loginException = (LoginException) ex;
			// 转发到登录页面
			modelAndView.setViewName("login");
			modelAndView.addObject("error", ex.getMessage());
		} else {
			modelAndView.addObject("error", ex.getMessage());
		}

		return modelAndView;
	}

}
