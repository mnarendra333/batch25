package com.pragim.myregapp.controller;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "test,user,test1,something,";
		System.out.println(s1.lastIndexOf(","));
		String s2 = s1.substring(0,s1.lastIndexOf(","));
		System.out.println(s2);

	}

}
