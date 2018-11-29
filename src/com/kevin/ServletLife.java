package com.kevin;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLife extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("servlet初始化完成");
	}	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().write("Servlet Life");
		System.out.println("servlet life");
	}
	public void destory() {
		System.out.println("我被销毁了。。。");

	}
	
	
}
