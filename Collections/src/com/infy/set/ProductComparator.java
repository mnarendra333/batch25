package com.infy.set;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		
		String s1 = p1.getName();
		String s2 = p2.getName();
		return s1.compareTo(s2);
	}

}
