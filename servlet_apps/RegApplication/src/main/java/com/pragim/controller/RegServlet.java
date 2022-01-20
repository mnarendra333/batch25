package com.pragim.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet implements Servlet {

    /**
     * Default constructor. 
     */
    public RegServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String username = request.getParameter("uname");
		
		String password = request.getParameter("pwd");
		
		
		String city = request.getParameter("city");
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("username "+username+" password "+password+" city "+city);
		
		
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			PreparedStatement prepareStatement = connection.prepareStatement("insert into user_info values(?,?,?)");
			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			prepareStatement.setString(3, city);
			
			int count = prepareStatement.executeUpdate();
			
			if(count==1) {
				out.println("<h1><font color=green>Reg completed for user<font> </h1>"+username);
			}
			
			
			/*create html file and configure the same as welcome file
			create servlet 
			fecth the html inputs into servlet 
			write the jdbc code 
			add the ojdbc14 jar to the lib folder*/
			
		} catch (Exception e) {
			e.printStackTrace()
		}
		
	}

}
