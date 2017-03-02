package com.hk.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆过滤器
 * 
 * @author xuda
 * 
 */
public class LoginFilter implements Filter {

	public void destroy() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();

		String uri = ((HttpServletRequest) request).getRequestURI();
		// 如果是登录就放行
		if (session.getAttribute("user") != null || uri.endsWith("login.jsp")
				|| uri.endsWith("login.action")) {
			// 放行
			chain.doFilter(request, response);
		} else {
			// request.getRequestDispatcher("/jsp/login.jsp").forward(request,
			// response);
			httpResponse.sendRedirect("/HKGW/jsp/login.jsp");
		}
	}
}
