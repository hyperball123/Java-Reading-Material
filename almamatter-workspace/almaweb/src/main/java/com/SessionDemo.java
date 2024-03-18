package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		ServletOutputStream out=response.getOutputStream();
		int count=0;
		if(session.isNew()) {
			out.println("<h1>session created for you....you are comming for the first time...</h1>");
			session.setAttribute("counter", 1);
		}
		else {
			int n=Integer.parseInt(session.getAttribute("counter").toString());
			n++;
			out.println("<h1>this is not your first visit...your visit number is.."+n+"</h1>");
			session.setAttribute("counter", n);
		}
	}

	
}
