package com.hariom;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class Calculator extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		
		String op = req.getParameter("operation");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		if (op.equals("ADD")) 
			out.println("THE RESULT IS " + (n1 + n2));
		
		else if (op.equals("SUBTRACT")) 
			out.println("THE RESULT IS " + (n1 - n2));
		
		else if (op.equals("MULTIPLY")) 
			out.println("THE RESULT IS " + (n1 * n2));
		
		else
			out.println("THE RESULT IS " + (n1 + n2));
		
		
		
	}
}