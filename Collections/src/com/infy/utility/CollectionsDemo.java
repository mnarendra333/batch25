package com.infy.utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import com.infy.list.IntComparator;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Collection and Collections(I)
		
		//arraylist - can you sort arraylist element without using treeset
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(90);
		al.add(50);
		al.add(80);
		al.add(20);
		System.out.println(al);
		
			
		
		Collections.sort(al,new IntComparator());
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		

	}

}
