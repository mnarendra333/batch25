package com.infy.iterators;

import java.util.ArrayList;

public class Java8ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		
		for (Integer integer : al) {
			System.out.println(integer);
		}
		System.out.println("=========");
		
		al.forEach(System.out::println);
		
		
		

	}

}
