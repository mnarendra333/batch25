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
		
		PreparedStatement prepareStatement = connection.prepareStatement("select * from employee");
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

}
