package com.infy.pack1;

public class Student {
	
	//varable declration 
	
	int stuId;
	String stuName;
	String stuAddress;
	float marks;
	
	
	
	public static void main(String[] args) {
		
		//object creation 
		//clas name and constuctor name should be same
		//constructor is used for intialising the instance varables 
		//class is a logical existance where as object is a phisical existance 
		Student ravi = new Student();
		System.out.println(ravi.stuId+" "+ravi.stuName+" "+ravi.stuAddress+" "+ravi.marks);
		
		
		Student obj2 = new Student();
		System.out.println(obj2.stuId+" "+obj2.stuName+" "+obj2.stuAddress+" "+obj2.marks);
		
		
		
	}
	
	
	
	
	
	
	
	

}
