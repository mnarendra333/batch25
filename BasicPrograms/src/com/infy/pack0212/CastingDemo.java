package com.infy.pack0212;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//byte->short->int->long->float->double
		//char->int->long->float->double
		
		
		//implicit casting
		//explicit casting 
		
		
		byte b=120;
		
		int x = b;
		System.out.println(x);
		
		
		byte b1 = (byte)x;
		System.out.println(b1);
		
		
		int p = 200;
		
		long l1 = p;
		
		int y = (int)l1;
		System.out.println(y);
		
		float f = l1;
		System.out.println(f);
		
		
		double d1 = f;
		
		double d2 = l1;
		
		
		char ch = 'u';
		
		int x1 = ch;
		
		long l2 = ch;
		
		float f2 = ch;
		
		double d3 = ch;
		
		
		
		
		
		

	}

}
