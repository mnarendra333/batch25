package com.infy.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(90);
		al.add(35);
		al.add(70);
		al.add(42);
		
		
		Collections.synchronizedList(al);
		
		
		

	}

}
