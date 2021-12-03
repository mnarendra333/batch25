package com.infy.pack3;

public class Student {
	
	
	int stuId;
	String stuName;
	String stuAddress;
	
	static String schoolName= "Geethams public school";
	
	
	public Student(int stuId, String stuName, String stuAddress) {
		
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(101, "surya", "bangl");
		System.out.println(s1.stuId+" "+s1.stuName+" "+s1.stuAddress+" "+schoolName);
		
		
		Student s2 = new Student(102, "nihal", "chenni");
		System.out.println(s2.stuId+" "+s2.stuName+" "+s2.stuAddress+" "+schoolName);
		
		
		
	}
	
	
	
	
	
	

}
