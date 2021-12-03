package com.infy.pack0212;

public class Employee extends Person{

	private int sal;
	
	public Employee(int id, String name, int sal) {
		this.setId(id);
		this.setName(name);
		this.sal = sal;
	}
	
	public int getSal() {
		return sal;
	}

}
