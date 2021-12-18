package com.infy.set;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new IntegerComparator());
		
		ts.add(40);
		ts.add(90);
		ts.add(39);
		ts.add(30);
		ts.add(60);
		ts.add(39);
		
		System.out.println(ts);
		

	}

}
