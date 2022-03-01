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
		
		//f6 f5 f8 
		try {
			EmployeeDAO dao = new EmployeeDAO();
			
			String id = request.getParameter("empid");
			String btnName = request.getParameter("buttonName");
			if(id!=null && "delete".equalsIgnoreCase(btnName)) {
				int eno = Integer.parseInt(id);
				String message = dao.deleteEmployee(eno);
				request.setAttribute("displayMsg", message);
			}
			if("add".equalsIgnoreCase(btnName)) {
				String name = request.getParameter("empname");
				String department = request.getParameter("dept");
				String salary = request.getParameter("sal");
				String designation = request.getParameter("designation");
				String hirdate = request.getParameter("hirdate");
				
				int sal = 0;
				if(salary!=null) {
					sal = Integer.parseInt(salary);
				}
				
				String message = dao.addEmployee(name,department,sal,designation,hirdate);
				request.setAttribute("displayMsg", message);
			}
			if(id!=null && "edit".equalsIgnoreCase(btnName)) {
				int eno = Integer.parseInt(id);
				Employee empObj = dao.loadEmployee(eno);
				request.setAttribute("employeeObj", empObj);
				RequestDispatcher dispatcher = request.getRequestDispatcher("employeeEdit.jsp");
				dispatcher.forward(request, response);
			}
			
			if("update".equalsIgnoreCase(btnName)) {
				int eno = Integer.parseInt(id);
				String name = request.getParameter("empname");
				String department = request.getParameter("dept");
				String salary = request.getParameter("sal");
				String designation = request.getParameter("designation");
				String hirdate = request.getParameter("hirdate");
				
				int sal = 0;
				if(salary!=null) {
					sal = Integer.parseInt(salary);
				}
			
				String message = dao.updateEmployee(eno,name,department,sal,designation,hirdate);
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
