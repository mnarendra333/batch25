package com.infy.set;

import java.util.TreeSet;

public class TreeSetWithStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Student> ts = new TreeSet<Student>();
		
		ts.add(new Student(11, "ravi", 300));
		ts.add(new Student(9, "omkar", 500));
		ts.add(new Student(21, "kadambari", 600));
		ts.add(new Student(15, "ramya", 900));
		ts.add(new Student(31, "prema", 1000));
		ts.add(new Student(80, "shivani", 700));
		ts.add(new Student(31, "anil", 600));
		
		
		
		for (Student student : ts) {
			System.out.println(student);
		}
		

	}

}
