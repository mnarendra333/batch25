package com.infy.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		
		
		//collections
		//arrays
		
		Integer x[] = {110,90,75,40,83};
		
		/*ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i : x) {
			al.add(i);
		}
		
		System.out.println(al);*/
		
		List<Integer> list = Arrays.asList(x);
		System.out.println(list);
		
		Arrays.sort(x);
		for (Integer integer : x) {
			System.out.println(integer);
		}
		
		
		//concurrentHashMap 

	}

}
