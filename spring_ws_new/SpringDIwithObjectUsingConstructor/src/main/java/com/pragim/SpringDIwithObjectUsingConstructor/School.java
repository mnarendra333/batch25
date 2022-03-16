package com.pragim.SpringDIwithObjectUsingConstructor;

public class School {
	
	private int id;
	private String schoolName;
	private String address;
	public int getId() {
		return id;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public School(int id, String schoolName, String address) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.address = address;
	}

	public String getSchoolInfo(){
		
		return "SchoolInfo :::"+getId()+" "+getSchoolName()+" "+getAddress();
	}
	
	
	

}
