package com.infy.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsDemo {
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(90);
		al.add(35);
		al.add(70);
		al.add(42);
	
		
		//compare the eleemnts - method1 to sort the elemenet into ascending order
		/*Collections.sort(al);
		System.out.println(al);*/
		
		Collections.sort(al, new IntComparator());
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
