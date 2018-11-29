package com.kevin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//	请求头数据
//		获取请求方式
		String method = req.getMethod();
		System.out.println(method);
//		获取请求URL
		StringBuffer url=req.getRequestURL();
		System.out.println(url);
//		获取URI
		String uri=req.getRequestURI();
		System.out.println(uri);
//		获取协议
		String h=req.getScheme();
		System.out.println(h);
		
//	获取用户数据
		
		
	}

}
