package com.infy.smartapplication;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x[] = {10,20,30,40,50};
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("======================");
		//enhanced for loop
		for (int i : x) {
			System.out.println(i);
		}
		
		
		//
		String str = "holiday";
		            //0123456
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		//
		StringBuffer sb = new StringBuffer("holiday");
		System.out.println(sb.reverse());
		
		
		String s1 = "pragim";
		String s2 = s1.concat("tech");
		
		System.out.println(s1+" "+s2);
		
		StringBuffer sb2 = new StringBuffer("pragim");
		
		sb2.append("tech");
		System.out.println(sb2);
		
		
		

	}

}
