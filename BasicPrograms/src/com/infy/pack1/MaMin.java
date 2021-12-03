package com.infy.pack1;

public class MaMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num[] = {10,5,30,60,34,99,86};
		//sort the array
		
		for (int i = 0; i < num.length; i++) {
			int temp=0;
			for (int j = i+1; j <num.length ; j++) {
				
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println(num[0]+" "+num[num.length-1]);
		

	}

}
