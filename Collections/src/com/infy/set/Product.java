package com.infy.set;

public class Product {
	
	private Integer id;
	private String name;
	private Double price;
	
	
	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Double getPrice() {
		return price;
	}


	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	

}
