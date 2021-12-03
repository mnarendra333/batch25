package com.infy.smartapplication;

public class PrintChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = args[0];
		
		char[] nameChars = name.toCharArray();
		
		for (int i = 0; i < nameChars.length; i++) {
			System.out.println(nameChars[i]);
		}
		
		System.out.println("=========================");
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		

	}

}
