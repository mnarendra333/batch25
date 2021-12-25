package com.infy.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "surya");
		map.put(20, "ravi");
		map.put(30, "cleark");
		map.put(40, "nihal");
		
		
		
		
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		//System.out.println(keys.getClass());
		
		Collection<String> values = map.values();
		System.out.println(values);
		//System.out.println(values.getClass());
		
		
		Set<Entry<Integer,String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		if(map.containsKey(90)) {
			System.out.println("40 elem exist");
		}else {
			System.out.println("40 not exist");
		}
		
		if(map.containsValue("surya")) {
			System.out.println(" exist");
		}else {
			System.out.println(" not exist");
		}	
		//map.clear();
		
		System.out.println(map.get(30));
		//System.out.println(map);
		
		//16 entries 
		
		// entryset 
		System.out.println("===============");
		for (Integer id:map.keySet()) {
			System.out.println(id+" "+map.get(id));
		}
		
		
		System.out.println(map.size());
		
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		Iterator<Entry<Integer,String>>	itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<Integer,String> obj = itr.next();
			System.out.println(obj.getKey()+" "+obj.getValue());
		}
		

	}

}
