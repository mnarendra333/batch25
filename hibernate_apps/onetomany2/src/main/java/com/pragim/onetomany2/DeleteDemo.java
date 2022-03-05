package com.pragim.onetomany2;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.onetomany2.entity.Customer;
import com.pragim.onetomany2.entity.Vendor;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Vendor vendor = session.get(Vendor.class, 1);
    	
    	
    	Set<Customer> customerList = vendor.getCustomerList(); // (1+1)
    	
    	Transaction tx = session.beginTransaction();
    	Iterator<Customer> iterator = customerList.iterator();
    	while (iterator.hasNext()) {
			Customer customer =  iterator.next();
			
			if(customer.getCustomerName().equals("altisource"))
				iterator.remove();
			
			//when ever it reaches the cursor to EMC condition becomes true...that record wil be deleted
			
		}
    	
    	tx.commit();
	}

}
