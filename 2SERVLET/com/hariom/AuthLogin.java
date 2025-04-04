package com.hariom;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AuthLogin extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		if (user.equals("Admin") && pass.equals("Admin123")) {
			RequestDispatcher rd = req.getRequestDispatcher("/home");
			user = "Hariom";
			req.setAttribute("name", user);
			rd.forward(req, res);
		}
		else {
			out.println("<h2> USER VERIFICATION FAILED!!! <h2>");
		}
	}
}
