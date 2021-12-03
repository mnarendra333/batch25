package com.infy.pack2;

public class Student {
	
	private int stuNo;
	private String stuName;
	private String stuAddress;
	
	//p c 
	public Student(int stuNo, String stuName, String stuAddress)
	{
		
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		
		this.work();
		this.sleep();
		
	}
	
	public Student()
	{
	
		System.out.println("i am from DC");
		
	}
	
	public Student(int sNo)
	{
	
		System.out.println("i am from Student with one parameter cons");
		
	}
	
	public int work() {
		System.out.println(this.stuName+"  is working");
		return 1;
	}
	
	public void sleep() {
		System.out.println(this.stuName+" is sleeping");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Student obj1 = new  Student(101,"ravi","bangl");
		System.out.println(obj1.stuNo+" "+obj1.stuName+" "+obj1.stuAddress);
		System.out.println(obj1);
		
		
		
		Student obj2 = new  Student(102,"kumar","mumbai");
		System.out.println(obj2.stuNo+" "+obj2.stuName+" "+obj2.stuAddress);
		System.out.println(obj2);
		
		
		
		//com.infy.pack2.Student
		//Student 
		
		//Flower
		//Animal 
		//Product
		
		
		
	}
	
	

}
