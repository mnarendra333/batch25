package com.infy.pack0312;

public class Operations {
	
	
	//overloading
	
	/*public void sum(int x, int y) {
		System.out.println("sum of 2 nos int,int "+(x+y));
	}*/
	
	/*public void sum(float x, float y) {
		System.out.println("sum of 2 nos float,float "+(x+y));
	}*/
	
	/*public void sum(double x, double y) {
		System.out.println("sum of 2 nos d,d "+(x+y));
	}
	
	public void sum(int x, float y) {
		System.out.println("sum of 2 nos int,float "+(x+y));
	}*/
	
	/*public void sum(float x, int y) {
		System.out.println("sum of 2 nos float,int "+(x+y));
	}*/
	
	public static void sum(int x, int y) {
		System.out.println("sum of 2 nos int,int "+(x+y));
	}
	
	
	
	
	
	public static void sum(int x, int y,int z) {
		System.out.println("sum of 3 nos "+(x+y+z));
	}
	
	
	public static void main(String[] args) {
		
		
		Operations obj = new Operations();
		
		long l1 = 10000l;
		long l2 = 20000l;
		
		int x = (int)l1;
		int y = (int)l2;
		
		obj.sum(x, y);
		
		
		
	}
	
	//diff params
	//number of params 
	//type of params
	//order of params
	
	
	// byte-> short->int->long->float->double
	//char ->int->long->float->double

	

}
