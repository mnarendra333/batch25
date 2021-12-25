package com.infy.list;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Integer i1 = o1.getEmpId();
		Integer i2 = o2.getEmpId();
		
		return -i1.compareTo(i2);
	}

}
