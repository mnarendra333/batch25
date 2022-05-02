package com.pragim.SrpingMVCCrudOperations.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pragim.SrpingMVCCrudOperations.model.Employee;
import com.pragim.SrpingMVCCrudOperations.util.EmployeeRowMapper;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public List<Employee> getAllEmployees() {
		
		List<Employee> list = jdbcTemplate.query("select * from emp", new EmployeeRowMapper());
		return list;
	}
	
	public String deleteEmployee(int id) {
		String message = null;
		int count = jdbcTemplate.update("delete from emp where id=?",id);
		if(count>=1)
			message =  "record deleted successfully";
		
		return message;
		
	}

	public String addEmployee(Employee employee) {
		String message = null;
		int count = jdbcTemplate.update("insert into emp values(emp_seq.nextval,?,?,?)",employee.getName(),employee.getSal(),employee.getAddr());
		if(count>=1)
			message =  "record added successfully";
		
		return message;
		
	}

	public Employee getEmployee(int id) {
		Employee empObj = jdbcTemplate.queryForObject("select * from emp where id=?", new EmployeeRowMapper(), id);
		return empObj;
	}

	public String updateEmployee(Employee employee) {
		System.out.println(employee);
		String message = null;
		int count = jdbcTemplate.update("update emp set emp_name=?,sal=?,addr=? where id=?",employee.getName(),employee.getSal(),employee.getAddr(),employee.getId());
		if(count>=1)
			message =  "record updated successfully";
		return message;
	}

}
