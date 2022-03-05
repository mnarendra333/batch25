package com.pragim.onetomany2;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.onetomany2.entity.Customer;
import com.pragim.onetomany2.entity.Vendor;

public class AddNewChildToParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	Vendor vendor = session.get(Vendor.class, 2);
		
    	//prepare new customer
    	Customer c1 = new Customer();
    	c1.setId(1023);
    	c1.setCustomerName("QTech");
    	c1.setCustomerAddress("hyd");
    	
    	Set<Customer> customerList = vendor.getCustomerList();
    	customerList.add(c1);
    	
    	tx.commit();

	}

}
