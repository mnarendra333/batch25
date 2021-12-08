package com.infy.pack0312;


class Parent
{
	private int x;
	private int y;
	
	public Parent() {
		System.out.println("i am from Parent class - DC");
	}
	
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("i am from Parent class - Par Cons");
	}
	
	
	
	public void method1() {
		System.out.println("i am from Parent class - method1 "+x+" "+y);
	
	}
	
}
public class Chaild extends Parent{
	
	private int z;
	
	public Chaild() {
		super();
		System.out.println("i am from Chaild class - DC");
	}
	
	public Chaild(int x,int y,int z) {
		super(x,y);
		this.z = z;
		System.out.println("i am from Chaild class - Par Cons");
	}
	
	public void method2() {
		System.out.println("i am from Chaild class - method2 "+z);
		this.method1();
		super.method1();
	}
	
	
	public static void main(String[] args) {
		Chaild obj = new Chaild(10,20,30);
		obj.method2();
		
		
		
		
	}
	
	

}
