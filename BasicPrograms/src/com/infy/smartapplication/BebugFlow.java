package com.infy.smartapplication;

public class BebugFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//f5 f6 f8
		
		//caller
		
		//step-1 : object creation
		BebugFlow obj = new BebugFlow();
		
		//step-2 : call method1
		int sum = obj.method1();
		System.out.println("sum is "+sum);
		
		//step-3 : call method2
		obj.method2();
		
		System.out.println("test stmt-1");
		
		System.out.println("test stmt-2");
		

	}
	
	
	//called
	int method1() {
		
		System.out.println("inside the method1");
		int x = 10;
		int y = 20;
		return x+y;
	}
	
	//called
	void method2() {
		
		int x = 10;
		int y=20;
		System.out.println("mul is "+(x*y));
		
	}
	
	
	

}
