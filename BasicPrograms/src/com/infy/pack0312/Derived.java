package com.infy.pack0312;

class Base
{
	//base-Derived
	//parent-chaild
	//super-sub
	public void method1() {
		System.out.println("I am from Base class method1");
	}
	
	public static void method3() {
		System.out.println("I am from Base class static method- method3");
	}
	
	
	
}


public class Derived extends Base{
	
	public void method2() {
		System.out.println("I am from Derived class method2");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Derived obj = new Derived();
		obj.method1();
		obj.method2();
		
		
		
		
		
		
		
		
	}
	

}
