package com.infy.pack2;

public class AvgDemo {

	
	public int calTotalMarks(int s1,int s2,int s3,int s4)
	{
		
		int total = s1+s2+s3+s4;
		return total;
	}
	
	public void avg(int totalMarks)
	{
		
		int res = totalMarks/4;
		System.out.println("Avg Marks "+res);
	}
	
	public static void method3() {
		System.out.println("execute the logic with in this metod");
	}
	
	
	
	
	public static void main(String[] args) {
		
		AvgDemo obj = new AvgDemo();
		int res = obj.calTotalMarks(56, 78, 97, 76);
		System.out.println("Total Marks are "+res);
		obj.avg(res);
		
		method3();
		
	}
	
	

}
