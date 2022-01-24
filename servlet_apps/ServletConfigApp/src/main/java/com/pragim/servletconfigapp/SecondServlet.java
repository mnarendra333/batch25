package com.pragim.servletconfigapp;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	/*	ServletConfig servletConfig = getServletConfig();
		
		String log4jlevel = servletConfig.getInitParameter("log4jlevel");
		System.out.println("log4j value "+log4jlevel);
		
		//using servletconfig object we can read the init params from xml
		String empid = servletConfig.getInitParameter("empid");
		System.out.println("empid "+empid);*/
		
		ServletContext servletContext = getServletContext();
		String log4jlevel = servletContext.getInitParameter("log4jlevel");
		System.out.println("log4j value "+log4jlevel);
		
		
	}

}
