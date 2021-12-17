package com.infy.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		
		//allows deplicates
		LinkedList<Integer> ll = new LinkedList<Integer>(al);
		
		ll.add(10);
		ll.add(10);
		ll.add(20);
		
		
		System.out.println(ll);
		
		
		//ArrayList LinkedList Vector Stack 
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
