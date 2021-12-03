package com.infy.smartapplication;

public class Caluculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caluculator obj = new Caluculator();
		obj.sum(10,20);
		obj.sub(200,20);
		obj.mul(200,20);
		obj.div(200,20);

	}
	
	
	
	public void sum(int x, int y) {
		System.out.println("sum is "+(x+y));
	}
	
	public void sub(int x, int y) {
		System.out.println("sub is "+(x-y));
	}
	
	public void mul(int x, int y) {
		System.out.println("mul is "+(x*y));
	}
	
	public void div(int x, int y) {
		System.out.println("div is "+(x/y));
	}
	
	
	
	
	
	
	
	

}
