package com.controller;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.*;
import com.model.*;

public class Login_controller extends HttpServlet{
	User user = new User();
	Login_service login_s = new Login_service();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		//将页面数据封装进model对象中
		user.setUser_name(req.getParameter("name"));
		user.setUser_password(req.getParameter("password"));
		user.setUser_power(Integer.parseInt(req.getParameter("power")));
		//调用业务逻辑层
		login_s.setUser(user);
		if(login_s.query())
		//页面跳转
		resp.sendRedirect("main.jsp");
		else 
		{
			
		}
	}

}
