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
//	����ͷ����
//		��ȡ����ʽ
		String method = req.getMethod();
		System.out.println(method);
//		��ȡ����URL
		StringBuffer url=req.getRequestURL();
		System.out.println(url);
//		��ȡURI
		String uri=req.getRequestURI();
		System.out.println(uri);
//		��ȡЭ��
		String h=req.getScheme();
		System.out.println(h);
		
//	��ȡ�û�����
		
		
	}

}
