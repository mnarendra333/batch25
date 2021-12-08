package com.infy.pack0812;

public abstract class Shape {
	
	public abstract void printShape();


}
class Circle extends Shape
{

	@Override
	public void printShape() {
		// TODO Auto-generated method stub
		System.out.println("Shape=Circle");
		
	}
	
	
	
	
}
class Rectangle extends Shape{
	
	@Override
	public void printShape() {
		// TODO Auto-generated method stub
		System.out.println("Shape=Rectangle");
		
	}
	
	public static void main(String[] args) {
		
		
		Rectangle obj = new Rectangle();
		obj.printShape();
		
	}
	
}
