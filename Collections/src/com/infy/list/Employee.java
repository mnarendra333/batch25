package com.infy.list;

public class Employee{

	private int empId;
	private String empName;
	private String addr;

	public Employee(int empId, String empName, String addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getAddr() {
		return addr;
	}


	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		/*String name1 = this.getEmpName();
		String name2 = o.getEmpName();
		return -name1.compareTo(name2);*/
		Integer i1 = this.getEmpId();
		Integer i2 = o.getEmpId();
		
		return -i1.compareTo(i2);
		
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", addr=" + addr + "]";
	};

}
