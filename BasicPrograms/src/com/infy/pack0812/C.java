package com.infy.pack0812;

class A{
	public void method1() {
		System.out.println("A class=>method1");
	}
}
class B extends A{
	
	/*public void method1() {
		System.out.println("B class=>method1");
	}*/
}

public class C extends B{
	
	/*public void method1() {
		System.out.println("C class=>method1");
	}*/
	
	
	public static void main(String[] args) {
		
		C obj = new C();
		obj.method1();
		
		
	}

}
