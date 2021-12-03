package com.infy.pack0212;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee emp = new Employee(101, "john", 25000);
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
		
		Student stu = new Student(1, "kiran", 550);
		System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getMarks());

	}

}
