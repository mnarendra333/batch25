package com.infy.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				
				
				return i1<i2?-1:(i1>i2)?1:0;
			}
		});
		
		ts.add(10);
		ts.add(50);
		ts.add(90);
		ts.add(25);
		ts.add(63);
		ts.add(58);
		
		System.out.println(ts);
		
		
		

	}

}
