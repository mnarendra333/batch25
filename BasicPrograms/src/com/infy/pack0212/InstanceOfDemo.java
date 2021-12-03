package com.infy.pack0212;

import com.infy.pack4.Student;

public class InstanceOfDemo {
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object s1 = new String("hello");
		Object stu = new Student(20, "surya", "bangl");
		
		if(s1 instanceof String) {
			System.out.println("s1 is an instance of string");
		} 
		if(stu instanceof Student) {
			System.out.println("stu is student object");
		}
		
		

	}

}
