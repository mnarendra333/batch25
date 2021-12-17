package com.infy.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();

		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(100);
		hs.add(400);
		hs.add(500);
		hs.add(600);

		System.out.println(hs);

	}

}
