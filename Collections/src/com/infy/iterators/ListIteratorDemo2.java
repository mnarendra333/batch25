package com.infy.iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		//System.out.println(al);
		//AL : LL : Vector : Stack
		ListIterator<Integer> litr = al.listIterator();
		System.out.println("=========fw=============");
		
		//10 20 30 40
		while (litr.hasNext()) {
			
			Integer obj = litr.next();
			if(obj == 20) {
				litr.add(25);
			}
			if(obj == 40) {
				litr.set(45);
			}
			if(obj == 30) {
				litr.remove();
			}
			
			
		}
		System.out.println(al);

	}

}
