package com.infy.pack4;

public class Student {

	private int id;
	private String name;
	private String address;

	// setter && getter

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}



	public static void main(String[] args) {

		Student obj = new Student(10,"surya","bangl");
		
		
		
		

	}

}
