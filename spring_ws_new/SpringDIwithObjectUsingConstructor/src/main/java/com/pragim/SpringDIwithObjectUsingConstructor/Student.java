package com.pragim.SpringDIwithObjectUsingConstructor;

public class Student {
	
	private int id;
	private String name;
	
	
	private School school;


	public int getId() {
		return id;
	}


	

	public String getName() {
		return name;
	}




	public School getSchool() {
		return school;
	}


	
	
	
	public Student(int id, String name, School school) {
		super();
		System.out.println("i am from constrctor");
		this.id = id;
		this.name = name;
		this.school = school;
	}




	public void getStudentInfo() {
		
		System.out.println(getId()+" "+getName()+" "+school.getSchoolInfo());
	}
	
	

}
