package com.infy.pack3;

public class LocalVariableDemo {

	public int x;
	
	public int y;

	public LocalVariableDemo(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	public void method1() {
		int x = 50;
		System.out.println(x+" "+this.x);
	}
	
	
	public static void main(String[] args) {
		
		LocalVariableDemo obj = new LocalVariableDemo(20, 30);
		obj.method1();
		
		
	}
	
	
	
	// instance variables - inside the class and outside the method
	//local  - inside the method
	//static variables - inside the class and outside the method
	

}
