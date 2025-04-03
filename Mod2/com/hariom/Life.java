package com.hariom;

import java.io.IOException;

import javax.servlet.http.*;

public class Life extends HttpServlet{
	
	public Life() {
		System.out.println("Servlet is Loaded");
	}
	
	public void init() {
		System.out.println("Init() -> Servlet Initialized");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		System.out.println("Service() -> Servlet is Handling Request");
		
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		
		int n3 = n1 + n2;
		
		res.getWriter().println("The Result is " + n3);
	}
	
	public void destroy() {
		System.out.println("Destroy() -> Servlet is Destroyed");
	}
}
