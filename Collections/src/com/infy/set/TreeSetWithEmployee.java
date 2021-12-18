package com.infy.set;

import java.util.TreeSet;

public class TreeSetWithEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee(100, "jogn", "bangl"));
		ts.add(new Employee(109, "surya", "chenni"));
		ts.add(new Employee(105, "suresh", "pune"));
		ts.add(new Employee(103, "akhil", "vizag"));
		
		
		System.out.println(ts);
		
		

	}

}
