package com.infy.pack0812;

 abstract  class Demo {
	
	
	
	
			public abstract  void method1();
			
			
			public   void method2() {
				System.out.println("method2");
			}
			
}
class Derived2 extends Demo{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Derived2 => method1");
	}
	
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Derived2 => method2");
	}
	
	
	
	public static void main(String[] args) {
		
		Derived2 obj = new Derived2();
		
		
		
		
		
	}
	
}
