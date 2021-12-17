package com.infy.list;

public class StackDemo {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		System.out.println("main");

	}

	private static void method1() {
		// TODO Auto-generated method stub
		
		
		method2();
		System.out.println("method1");
	}

	private static void method2() {
		// TODO Auto-generated method stub
		method3();
		System.out.println("method2");
	}

	private static void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3");
		
	}

}
