package com.infy.set;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return  i1<i2?1:(i1>i2)?-1:0;
	}

}
