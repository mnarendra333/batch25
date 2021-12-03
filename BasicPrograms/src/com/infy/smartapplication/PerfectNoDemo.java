package com.infy.smartapplication;

import java.util.Scanner;

public class PerfectNoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("pass int value as input");
		int number = sc.nextInt();
		
		//123 
		
		//123%10 = 3
		//12 = 123/10;
		
		//12%10 = 2
		
		//1 = 12/10
		
		//1%10 = 1
		int dupNumber = number;
		int sum =0;
		int mul = 1;
		while(number>0) {
			
			int rem = number%10;
			
			sum = sum+rem;
			mul = mul*rem;
			
			number = number/10;
		}
		System.out.println(sum+" "+mul);
		
		if(sum == mul) {
			System.out.println(dupNumber+ " is perfect");
		}else {
			System.out.println(dupNumber+ " is not perfect");
		}
		
		//ite-1
		/*123>0
		 * r = 3
		 * sum=3
		 * mul=3
		 * number=12
		 * 
		 * ite-2
		 * 12>0
		 * r=2
		 * sum=5
		 * mul=6
		 * number=1
		 * ite-3
		 * 1>0
		 * r=1;
		 * sum=6
		 * mul =6
		 * number=0
		 */
		
		
		
		

	}

}
