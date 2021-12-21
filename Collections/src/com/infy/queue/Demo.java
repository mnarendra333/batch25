package com.infy.queue;

import java.util.ArrayList;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 10; i <=100; i+=10) {
			al.add(i);
		}
		
		//System.out.println(al);
		
		//al-10
		
		for(Integer i1:al) {
			if(i1>60)
				System.out.println(i1);
		}
		System.out.println("========================");
		for (int i = 0; i <al.size(); i+=1) {
			System.out.println(al.get(i));
		}
		
		//iterators
		//1> Enumaration 1.0 - legacy collection (Vector,stack,Hashtable)
		//2>Iterator
		//3>ListIterator
		
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		
		
		
			

	}

}
