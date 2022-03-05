package com.pragim.onetomany2.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Vendor {

	@Id
	private int id;
	@Column(length = 30)
	private String vendorName;
	@Column(length = 30)
	private String venAddr;

	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name = "ven_id")
	private Set<Customer> customerList;

	public Set<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Set<Customer> customerList) {
		this.customerList = customerList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVenAddr() {
		return venAddr;
	}

	public void setVenAddr(String venAddr) {
		this.venAddr = venAddr;
	}

}
