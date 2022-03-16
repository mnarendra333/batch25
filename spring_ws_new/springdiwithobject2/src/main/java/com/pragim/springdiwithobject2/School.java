package com.pragim.springdiwithobject2;

import org.springframework.stereotype.Component;

@Component
public class School {
	
	private int id;
	private String schoolName;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public String getSchoolInfo(){
		
		return "SchoolInfo :::"+getId()+" "+getSchoolName()+" "+getAddress();
	}
	
	
	

}
