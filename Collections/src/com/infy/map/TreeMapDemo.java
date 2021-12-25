package com.infy.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(50, "surya");
		map.put(20, "ravi");
		map.put(10, "cleark");
		map.put(35, "nihal");
		
		System.out.println(map);
		
		System.out.println(map.descendingMap());
		
		//10,20,35,50
		
		
		
		
		

	}

}
