package com.infy.pack4;

import java.util.Date;

public class JavaProgFlow {

	static {
		System.out.println("i am from static block");
	}

	{
		System.out.println("i am from instance block");
	}

	public JavaProgFlow() {
		System.out.println("DC called");
	}

	public void method1() {
		System.out.println("i am from method1");
		System.out.println(new Date());
	}

	public static void main(String[] args) {

		JavaProgFlow obj = new JavaProgFlow();
		obj.method1();

	}

}
