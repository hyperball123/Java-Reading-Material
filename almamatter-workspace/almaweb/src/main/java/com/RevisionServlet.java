package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RevisionServlet
 */
@WebServlet(
			loadOnStartup = 1,
			urlPatterns = {"/hello","*.doo","/tlatla"},
			initParams = {
					@WebInitParam(name="driver",value="com.mysql.cj.jdbc.Driver"),
					@WebInitParam(name="yourname",value="johny johny yes papa")
			}
		)
public class RevisionServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("init method called....");
    	String d=config.getInitParameter("driver");
    	String n=config.getInitParameter("yourname");
    	
    	System.out.println(d+":"+n);
    	ServletContext application=config.getServletContext();
    	
    	application.setAttribute("globalkey", "this is global value.....");
    	System.out.println("From init....:"+application.getAttribute("globalkey"));
    }
    @Override
    public void destroy() {
    	System.out.println("destroy method....");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletContext ctx=request.getServletContext();
		System.out.println("from current servlet request...:"+ctx.getAttribute("globalkey"));
		ServletContext ctx2=request.getSession().getServletContext();
		System.out.println("from current servlet request-session...:"+ctx.getAttribute("globalkey"));
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
