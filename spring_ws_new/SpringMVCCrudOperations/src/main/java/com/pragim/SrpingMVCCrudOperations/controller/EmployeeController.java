package com.pragim.SrpingMVCCrudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pragim.SrpingMVCCrudOperations.dao.EmployeeDao;
import com.pragim.SrpingMVCCrudOperations.model.Employee;
import com.pragim.SrpingMVCCrudOperations.util.EmployeeRowMapper;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@GetMapping(path = "/emplist")
	public ModelAndView getAllEmployees() {
		
		List<Employee> allEmployees = employeeDao.getAllEmployees();
		return new ModelAndView("employeeList", "empList", allEmployees);
	}
	
	@GetMapping(path = "/deleteemp/{id}")
	public String deleteEmployee(@PathVariable String id) {
		int empId = Integer.parseInt(id);
		String msg = employeeDao.deleteEmployee(empId);
		
		return "redirect:/emplist";
	}
	
	@GetMapping(path = "/addempform")
	public String displayEmployeeForm(Model model) {
		model.addAttribute("command", new Employee());
		return "addEmployee";
	}
	
	@GetMapping(path = "/editempform/{id}")
	public String displayEmployeeForm(Model model,@PathVariable String id) {
		Employee employee = employeeDao.getEmployee(Integer.parseInt(id));
		model.addAttribute("command", employee);
		return "editEmployee";
	}
	
	@PostMapping(path = "/saveemp")
	public String storeEmployeeData(@ModelAttribute("employee") Employee employee) {
		String addEmployee = employeeDao.addEmployee(employee);
		return "redirect:/emplist";
	}
	
	@PostMapping(path = "/updateemp")
	public String updateEmployeeData(@ModelAttribute("employee") Employee employee) {
		String addEmployee = employeeDao.updateEmployee(employee);
		return "redirect:/emplist";
	}
	
	
	
	
	
	
	

}
