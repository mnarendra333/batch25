package com.pragim.filterapp.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.pragim.filterapp.util.ConnectionUtility;

/**
 * Servlet Filter implementation class AuthFilter
 */
public class AuthFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		try {
			
			//pre processing 
			Connection connectionFromDB = ConnectionUtility.getConnectionFromDB();
			
			String username = request.getParameter("uname");
			String password = request.getParameter("pwd");
			

			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			
			PreparedStatement prepareStatement = connectionFromDB.prepareStatement("select * from personal_info where email=? and password=?");
			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			
			ResultSet rs = prepareStatement.executeQuery();
			if(rs.next()) {
				chain.doFilter(request, response);
				//post processing 
				out.println("<h1><font color=green>Post processing Logic</h1>");
			}else {
				out.println("<h1><font color=green>Login Failed, please try with right cred</h1>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.html");
				requestDispatcher.include(request, response);
			}
			
			// pass the request along the filter chain
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
