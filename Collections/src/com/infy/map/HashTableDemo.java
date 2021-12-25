package com.infy.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();

		map.put(50, "surya");
		//map.put(null, "ravi");
		map.put(10, "cleark");
		map.put(35, "nihal");
		
		//System.out.println(map);
		
		
		Enumeration<String> enumMap = map.elements();
		
		while (enumMap.hasMoreElements()) {
			String string =  enumMap.nextElement();
			System.out.println(string);
		}
		
		
		Set<Entry<Integer,String>> setEntry = map.entrySet();
		
		for (Entry<Integer, String> entry : setEntry) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		Iterator<Entry<Integer,String>> itr = setEntry.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer,String> entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			 
		}
		

	}

}
