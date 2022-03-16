package com.pragim.AutowiringUsingXML;

public class EmployeeBean {
	
	private DepartmentBean dbean;
	
	/*
	 * public void setDbean(DepartmentBean dbean) { this.dbean = dbean; }
	 */
	
	
	  public EmployeeBean(DepartmentBean dbean) { 
		  this.dbean = dbean; 
	  }
	 
	
	
	public void getEmployeeBeanInfo() {
		String data = dbean.getDeptInfo();
		System.out.println(data);
	}
	

}
