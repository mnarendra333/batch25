package com.infy.iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			
			if(itr.next()==30) {
				itr.remove();
			}
				
			
		}
		System.out.println(al);
		
		
		/*HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		for (Integer integer : hs) {
			if(integer == 20)
				hs.remove(integer);
		}
		System.out.println(hs);*/
		
		
		
		
		

	}

}
