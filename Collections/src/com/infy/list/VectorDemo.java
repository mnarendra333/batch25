package com.infy.list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Integer> vector = new Vector<Integer>();
		//vector.add(10);
		//System.out.println(10);
		
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		
		
		for (int i = 10; i <=100; i+=10) {
			vector.add(i);
		}
		System.out.println(vector.capacity()+" "+vector.size());
		//2 * IC 
		vector.add(110);
		System.out.println(vector.capacity()+" "+vector.size());
		for (int i = 120; i <=250; i+=10) {
			vector.add(i);
		}
		
		
		
		System.out.println(vector.capacity()+" "+vector.size());
		//syncronized
		
		
		//diff AL and Vector
		
		
		
		
		
	}

}
