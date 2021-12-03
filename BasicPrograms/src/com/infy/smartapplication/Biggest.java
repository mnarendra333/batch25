package com.infy.smartapplication;

public class Biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		
		//debug any program 
		// f6 f5 f8
		
		//f6 - to go to next line
		//f5 - go inside a method
		//f8 - go to next break point
		
		
		if(a>b && a>c) {
			System.out.println(a+" is big");
		}else if(b>c) {
			System.out.println(b +" is big");
		}else {
			System.out.println(c+" is big");
		}
		
		
		int result = (a>b&&a>c)?a:(b>c)?b:c;
		System.out.println(result);
		
		
		
		

	}

}
