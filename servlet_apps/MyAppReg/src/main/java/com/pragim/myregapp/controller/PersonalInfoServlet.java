package com.pragim.myregapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalInfoServlet
 */
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		
		String email = request.getParameter("usr_email");
		
		String password = request.getParameter("pwd");
		
		String dob = request.getParameter("dob");
		
		String gender = request.getParameter("gender");
		
		String address = request.getParameter("address");
		
		String city = request.getParameter("city");
		
		String[] hobbies = request.getParameterValues("hobbies");
		
		StringBuffer sb = new StringBuffer();
		for (String string : hobbies) {
			sb.append(string).append(",");
		}
		
		String modHobbies = sb.toString();
		
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		/* create table personal_info(fname varchar2(20),lname varchar2(20),email varchar2(20),password varchar2(20)
				 ,dob varchar2(20),gender varchar2(20),address varchar2(20),city varchar2(20),hobbies varchar2(30));*/
		
	try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			
			PreparedStatement prepareStatement = connection.prepareStatement("insert into personal_info values(?,?,?,?,?,?,?,?,?)");
			prepareStatement.setString(1, fname);
			prepareStatement.setString(2, lname);
			prepareStatement.setString(3, email);
			prepareStatement.setString(4, password);
			prepareStatement.setString(5, dob);
			prepareStatement.setString(6, gender);
			prepareStatement.setString(7, address);
			prepareStatement.setString(8, city);
			prepareStatement.setString(9, modHobbies);
			
			int count = prepareStatement.executeUpdate();
			
			if(count==1) {
				pw.println("<h1><font color=green>Reg completed for user<font> "+fname+lname+"</h1>");
			}
			
			
			/*create html file and configure the same as welcome file
			create servlet 
			fecth the html inputs into servlet 
			write the jdbc code 
			add the ojdbc14 jar to the lib folder*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
			
		
		
	}

}
