package com.pragim.employeemgtsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pragim.employeemgtsystem.model.Employee;
import com.pragim.employeemgtsystem.util.ConnectionUtility;

public class EmployeeDAO {
	
	
	
	
	public List<Employee> getAllEmployees() throws SQLException{
		Connection connection = ConnectionUtility.getConnectionFromDB();
		
		PreparedStatement prepareStatement = connection.prepareStatement("select * from employee order by id asc");
		ResultSet rs = prepareStatement.executeQuery();
		List<Employee> emplist = new ArrayList<Employee>();
		while (rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setDept(rs.getString(3));
			emp.setSal(rs.getInt(4));
			emp.setDesignation(rs.getString(5));
			emp.setHiredate(rs.getString(6));
			emplist.add(emp);
		}
		return emplist;
		//whatever the data present in resultset gets converted to list of employees 
	}
	
	public String deleteEmployee(int id) throws SQLException{
		Connection connection = ConnectionUtility.getConnectionFromDB();
		String message = null;
		PreparedStatement prepareStatement = connection.prepareStatement("delete from employee where id=?");
		prepareStatement.setInt(1, id);
		int count = prepareStatement.executeUpdate();
		
		if(count>=1) {
			message = "Employee deleted successfully";
		}
		return message;
	}

	public String addEmployee(String name, String department, int salary, String designation, String hirdate) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection connection = ConnectionUtility.getConnectionFromDB();
		String message = null;
		PreparedStatement pstmt = connection.prepareStatement("insert into employee values(employee_seq.nextval,?,?,?,?,?)");
		pstmt.setString(1, name);
		pstmt.setString(2, department);
		pstmt.setInt(3, salary);
		pstmt.setString(4, designation);
		pstmt.setString(5, hirdate);
		
		int count = pstmt.executeUpdate();
		if(count>=1) {
			message = "Employee Added successfully";
		}
		return message;
		
		
	}

	public Employee loadEmployee(int eno) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionUtility.getConnectionFromDB();
		String message = null;
		PreparedStatement pstmt = connection.prepareStatement("select * from employee where id=?");
		pstmt.setInt(1, eno);
		ResultSet rs = pstmt.executeQuery();
		Employee emp = new Employee();
		if(rs.next()) {
			
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setDept(rs.getString(3));
			emp.setSal(rs.getInt(4));
			emp.setDesignation(rs.getString(5));
			emp.setHiredate(rs.getString(6));
		}
		return emp;
	}

	public String updateEmployee(int eno, String name, String department, int sal, String designation, String hirdate) throws SQLException {
		Connection connection = ConnectionUtility.getConnectionFromDB();
		String message = null;
		PreparedStatement pstmt = connection.prepareStatement("update employee set name=?,dept=?,sal=?,designation=?,hiredate=? where id=?");
		pstmt.setString(1, name);
		pstmt.setString(2, department);
		pstmt.setInt(3, sal);
		pstmt.setString(4, designation);
		pstmt.setString(5, hirdate);

		pstmt.setInt(6, eno);
		
		int count = pstmt.executeUpdate();
		if(count>=1) {
			message = "Employee Updated successfully";
		}
		return message;
	}

}
