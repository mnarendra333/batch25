package com.infy.pack1112;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 50;
		
		Integer i1 = x;
		System.out.println(i1);
		
		int y = i1;
		System.out.println(y);
		
		
		//value
		//valueOf
		
		
		Object obj = new String("hello");
		String str = (String)obj;
		
		Long l1 = 20000l;
		Short ii1 = l1.shortValue();
		
		long l5 = 500;
		int i9 = (int)l5;
		
		
	}

}
