package com.pragim.hibernatesgeneators.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//hibernate will create a sequense with name 
	//called hibernate_sequense
@Entity
@Table(name="product_tab")
public class Product {

	@Id
	@GeneratedValue
	@Column(name="pro_id")
	private int id;

	@Column(name="pro_name",length = 30)
	private String productName;

	@Column(name="pro_price")
	private int price;

	private int qty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
//ORM //one object is nothing but one row in the DB

//to configure out own sequense
/*

@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "prod_seq")
@SequenceGenerator(name = "prod_seq",sequenceName ="prod_seq",allocationSize = 1,initialValue = 1)


*/