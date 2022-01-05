package com.pragim.ude;

import java.util.Scanner;

public class AgeDemo {

	void vaidateAge(int age) throws InvliadAgeException{
		if(age>=18)
			System.out.println("he/she eligible to vote");
		else
			throw new InvliadAgeException("age is not valid , should be greater than or equal to 18");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		AgeDemo obj = new AgeDemo();
		
		try {
			obj.vaidateAge(age);
		} catch (InvliadAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("======completed=======");
		
		
		
	}

}
