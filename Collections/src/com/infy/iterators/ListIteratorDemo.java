package com.infy.iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		//System.out.println(al);
		
		ListIterator<Integer> litr = al.listIterator();
		System.out.println("=========fw=============");
		while (litr.hasNext()) {
			System.out.println(litr.next());
			
		}
		System.out.println("=========bw=============");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
			
		}
		
		
		
		
		
		

	}

}
