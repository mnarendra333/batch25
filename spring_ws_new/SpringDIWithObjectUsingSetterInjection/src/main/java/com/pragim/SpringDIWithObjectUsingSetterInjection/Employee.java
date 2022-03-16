package com.pragim.SpringDIWithObjectUsingSetterInjection;

public class Employee {
	
	
	private Department dept;
	
	private Universiry univ;
	
	//setter injection 
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	//setter injection 
	public void setUniv(Universiry univ) {
		this.univ = univ;
	}
	
	
	public void getEmployeeInfo() {
		//tightly coupled system
		
		String dename = dept.getDeptInfo();
		System.out.println("DeptName :: "+dename);
		
		
		  String univInfo = univ.getUnivInfo();
		  System.out.println("univInfo :: "+univInfo);
		 
	}

	

}
