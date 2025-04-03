package com.hariom;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Current_Date extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy & hh:mm:ss");
		String currentDate = formatter.format(new Date());
		
		HttpSession session = req.getSession(true);
		
		String LastAccessDATE = (String) session.getAttribute("LastAccess");
		session.setAttribute("LastAccess", currentDate);
		
		out.println("<h1><u> Current Date & Time:</u> " + currentDate + "</h1>");
		
		if (LastAccessDATE != null)
			out.println("<h3><u> Last Access Date & Time:</u> " + LastAccessDATE + "</h3>");
		
	}
}
