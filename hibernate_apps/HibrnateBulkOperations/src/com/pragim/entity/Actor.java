package com.pragim.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table

public class Actor {
	@Id
	@GeneratedValue
	@Column
	private int id;
	

	@Column(length = 30,unique = true)
	private String name;
	
	@Column(length = 40)
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
