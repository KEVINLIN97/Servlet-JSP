package com.kevin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMethod extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("����service");

	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("����get��ʽ");
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			System.out.println("����post");
		}
}
