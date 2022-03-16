package com.pragim.AutowiringUsingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
	
	
	private DepartmentBean departmentBean;
	
	
	
	@Autowired
	  public void setDbean(DepartmentBean departmentBean) { 
		  this.departmentBean = departmentBean; 
		  }
	 
	 
	
	
	 
	/*
	 * public EmployeeBean(DepartmentBean dbean) { this.dbean = dbean; }
	 */
	 
	 
	
	
	public void getEmployeeBeanInfo() {
		String data = departmentBean.getDeptInfo();
		System.out.println(data);
	}
	

}
