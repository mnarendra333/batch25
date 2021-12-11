package com.infy.op;

import com.infy.sp.Base;

public class DerivedHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base obj = new Base();
		System.out.println(obj.d);
		
		
		//private = we can access within the class
		//default = within the class,with in same package 
		//protected = within class,with in same package, outside package-IS-A
		//public = we can access any where 

	}

}
