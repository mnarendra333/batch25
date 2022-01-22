package com.pragim.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
try {
			
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
	
			String userEmail = request.getParameter("email");
			String password = request.getParameter("pwd");
	
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			PreparedStatement prepareStatement = connection.prepareStatement("select * from personal_info where email=? and password=?");
			prepareStatement.setString(1, userEmail);
			prepareStatement.setString(2, password);
			
			ResultSet rs  = prepareStatement.executeQuery();
			
			if(rs.next()) {
				pw.println("<h1><font color=green>Login Success</font><h1>");
			}else {
				pw.println("<h1><font color=red>Login Failed, Please try with right cred</font><h1>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
