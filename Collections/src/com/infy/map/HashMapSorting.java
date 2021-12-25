package com.infy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		
		map.put(50, "surya");
		map.put(20, "ravi");
		map.put(10, "cleark");
		map.put(35, "nihal");
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		
		/*TreeSet<Integer> ts = new TreeSet<Integer>(keys);
		System.out.println(ts);
		for (Integer integer : ts) {
			lmap.put(integer,map.get(integer));
		}
		System.out.println(lmap);*/
		Object i1[] = keys.toArray();
		
		Integer numbers[] = new Integer[keys.size()];
		for (int i = 0; i < i1.length; i++) {
			numbers[i] = (Integer)i1[i];
		}
		
		
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				int temp =0;
				if(numbers[i]>numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (Integer integer : numbers) {
			lmap.put(integer,map.get(integer));
		}
		System.out.println(lmap);

	}

}
