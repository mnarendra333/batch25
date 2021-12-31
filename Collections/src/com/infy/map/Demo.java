package com.infy.map;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.infy.set.Student;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		
		Student obj1 = new Student(101, "surya", 200);
		Student obj2 = new Student(101, "surya", 200);
		
		//importance of hashcode and equals = 
		
		System.out.println(obj1.hashCode()+" "+obj2.hashCode());
		
		

	}

}
