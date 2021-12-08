package com.infy.pack0812;

public class Person extends Object {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// object-super class
	// Person- Sub Class

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {

		return getId() + " " + getName() + " " + getAge();
	}

	public static void main(String[] args) {

		Person obj = new Person(101, "Surya", 28);
		
		System.out.println(obj.toString());

	}

}
