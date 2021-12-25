package com.infy.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer, String> map = new IdentityHashMap<Integer, String>();
		map.put(new Integer(10), "hello");
		map.put(new Integer(10), "hi");
		
		System.out.println(map);
		

	}

}
