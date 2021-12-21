package com.infy.iterators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3 //iterators
		//1> Enumaration 1.0 - legacy collection (Vector,stack,Hashtable)
		//2>Iterator
		//3>ListIterator
		//for each 1.5
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		
		System.out.println(vector);
		//1.0
		Enumeration<Integer> enumaration = vector.elements();
		while (enumaration.hasMoreElements()) {
			System.out.println(enumaration.nextElement());
			
		}
		
		//elements - this method create the object of enumaration
		//hasMoreElements - this method used for checking elemenet or present inside the legacy collection or not
		//nextElement - this method is used to print next element inside the collection or one by one 
		//element from legacy collection
		
		
		for (Integer integer : vector) {
			System.out.println(integer);
		}
		
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		
		
		
		
		

	}

}
