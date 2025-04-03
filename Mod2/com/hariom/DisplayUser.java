package com.hariom;

import java.io.IOException;
import javax.servlet.http.*;

public class DisplayUser extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Object user = req.getAttribute("name");

		res.setContentType("text/html");
		res.getWriter().println("<h1> Welcome Back!!! " + user + "</h1>");
	}
}
