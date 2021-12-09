package com.infy.pack0912;



abstract class Super {

	private int x, y;

	public Super(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Abstarct class cons");
	}

	public void method1() {
		System.out.println("I am from method1");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract void method2();

}

public class Sub extends Super{
	
	
	private int z;
	
	
	
	public Sub(int x, int y, int z)
	{
		super(x, y);
		this.z = z;
		System.out.println("Sub class cons");
	}
	
	

	public int getZ() {
		return z;
	}



	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
		System.out.println("i am from SubClass=> method2");
	}
	
	public static void main(String[] args) {
		
		Sub obj = new Sub(30,20,10);
		System.out.println(obj.getX()+" "+obj.getY()+" "+obj.getZ());
		
		obj.method1();
		obj.method2();
		
	}

}
