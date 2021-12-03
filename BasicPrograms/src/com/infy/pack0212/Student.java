package com.infy.pack0212;

public class Student extends Person{

	private int marks;
	
	public Student(int id,String name, int marks) {
		this.setId(id);
		this.setName(name);
		this.marks = marks;
		
		
	}
	
	public int getMarks() {
		return marks;
	}

}
