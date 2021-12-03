package com.infy.smartapplication;

public class PerfectNumLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		for (int i = 10; i<=1000; i++) {
			
			
			int no=i;
			int dupNumber = i;
			int sum =0;
			int mul = 1;
			while(no>0) {
				
				int rem = no%10;
				
				sum = sum+rem;
				mul = mul*rem;
				
				no = no/10;
			}
			//System.out.println(sum+" "+mul);
			
			if(sum == mul) {
				System.out.println(dupNumber+ " is perfect");
			}
			
		}

	}

}
