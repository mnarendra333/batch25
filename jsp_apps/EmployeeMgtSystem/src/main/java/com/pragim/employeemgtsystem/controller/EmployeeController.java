package com.pragim.employeemgtsystem.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pragim.employeemgtsystem.dao.EmployeeDAO;
import com.pragim.employeemgtsystem.model.Employee;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			EmployeeDAO dao = new EmployeeDAO();
			
			String id = request.getParameter("empid");
			String operation = request.getParameter("opName");
			if(id!=null && "delete".equalsIgnoreCase(operation)) {
				int eno = Integer.parseInt(id);
				String message = dao.deleteEmployee(eno);
				request.setAttribute("displayMsg", message);
			}
			
			
			List<Employee> allEmployees = dao.getAllEmployees();
			//to carry the data from servlet to jsp 
			request.setAttribute("empList", allEmployees);
			
			
			
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("employeeList.jsp");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
