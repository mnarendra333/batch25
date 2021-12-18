package com.infy.set;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	
	//obj1.compareTo(obj2);
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		/*Integer i1 = this.getId();
		Integer i2 = o.getId();
		return i1.compareTo(i2);*/
		
		String s1 = this.getName();
		String s2 = o.getName();
		
		return s1.compareTo(s2);
	}

}
