package com.infy.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to sort the al elements without treeset

		List<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(101, "ravi", "bangl"));
		al.add(new Employee(109, "kiran", "chenni"));
		al.add(new Employee(107, "vikram", "pune"));
		al.add(new Employee(102, "akhil", "delhi"));

		Collections.sort(al,new EmployeeComparator());
		
		for (Employee employee : al) {
			System.out.println(employee);
		}

	}

}
