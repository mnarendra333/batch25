package com.infy.set;

import java.util.TreeSet;

public class TreeSetWithComparatorandProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Product> ts = new TreeSet<Product>(new ProductComparator());
		
		ts.add(new Product(1001, "lenovo-bm", 59000.0));
		ts.add(new Product(1009, "hp-bm", 45000.0));
		ts.add(new Product(1007, "dell-bm", 55000.0));
		ts.add(new Product(1011, "mac-bm", 95000.0));
		ts.add(new Product(1004, "aser-bm", 39000.0));
		
		//System.out.println(ts);
		
		for (Product product : ts) {
			System.out.println(product);
		}

	}

}
