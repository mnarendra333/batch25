package com.infy.pack0812;

class Base{
	
	public void method1() {
		System.out.println("Base Class => method1");
	}
	
}
public class Derived extends Base{
	
	public void method1() {
		System.out.println("Derived Class => method2");
	}
	
	
	public static void main(String[] args) {
		
		Derived obj = new Derived();
		obj.method1();
		
		
	}
	
}
