package com.infy.pack0912;

interface I1
{
	int x=20;
	
	
}
interface I2
{
	int x =40;
	
}

public class Demo implements I1,I2{

	public static void main(String[] args) {
		
		
		System.out.println(I1.x);
		
		
	}

	
}
