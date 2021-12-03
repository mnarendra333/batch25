package com.infy.smartapplication;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=10;
		int y=20;
		
		
		if(x == y) {
			System.out.println(x+" "+y+" are equal");
		}else {
			System.out.println(x+" "+y+" are not equal");
		}
		
		
		//scp - test - 1001
		//heap 
		//s3 = 1003
		//s4  = 1004
		
		String s1 = "test";
		String s2 = "test";
		String s3 = "test";
		
		
		String s4 = new String("test");
		String s5 = new String("test");;
		
		if(s1==s5)
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
		
		
		
		
		
		

	}

}
