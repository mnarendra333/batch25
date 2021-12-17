package com.infy.set;

import java.util.TreeSet;

public class TreeSetWithComparatorNewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());
		

		ts.add(10);
		ts.add(50);
		ts.add(90);
		ts.add(25);
		ts.add(63);
		ts.add(58);
		
		System.out.println(ts);
		
		

	}

}
