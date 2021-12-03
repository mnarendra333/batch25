package com.infy.pack4;

public class Product {
	
	
	private int id;
	private String name;
	private double price;
	
	//getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//f6 //f5 //f8
	public void printAllVariables() {
		System.out.println(hashCode()+" "+getId()+" "+getName()+" "+getPrice());
	}
	
	public static void main(String[] args) {
		
		
		Product obj1 = new Product();
		obj1.setId(101);
		obj1.setName("Dell-lap-inspiron-5430");
		obj1.setPrice(67000);
		
		
		
		obj1.printAllVariables();
		
		
		Product obj2 = new Product();
		obj2.setId(102);
		obj2.setName("Dell-lap-5430");
		obj2.setPrice(57000);
		
		
		
		obj2.printAllVariables();
		
	}
	
	
	
	
	

}
