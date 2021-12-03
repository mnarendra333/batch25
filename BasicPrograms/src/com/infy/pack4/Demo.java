package com.infy.pack4;

public class Demo{
	
	static {
		System.out.println("hello i am from static block-before main");
	}
	

	public static void main(String[] args) {
		
		System.out.println("i am from main method");
		
		Demo obj = new Demo();
		
		
		System.out.println(obj.toString());
	}

}
