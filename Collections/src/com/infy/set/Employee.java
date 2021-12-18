package com.infy.set;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private String addr;

	public Employee(int id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		/*String name1 = this.getName();
		String name2 =	o.getName();
		return name1.compareTo(name2);*/
		
		int i1 = this.getId();
		int i2 = o.getId();
		return i1<i2?-1:(i1>i2)?1:0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	};
	
	

}
