package com.pragim.onetomany2;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.onetomany2.entity.Customer;
import com.pragim.onetomany2.entity.Vendor;

public class UpdateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create session factoryy object 
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//create session 
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		/*Vendor vendor = session.get(Vendor.class, 1);
		Set<Customer> customerList = vendor.getCustomerList();
		
		Iterator<Customer> iterator = customerList.iterator();
		
		while (iterator.hasNext()) {
			Customer customer =  iterator.next();
			if(customer.getCustomerName().equalsIgnoreCase("Capgemini")) {
				customer.setCustomerAddress("Mumbai");
			}
		}
		
		tx.commit();*/
		
		
		Customer customer = session.get(Customer.class, 1003);
		customer.setCustomerAddress("pune");
		tx.commit();
		
		//vendor is loaded to cache - infy,1,bangl
		//child objects loaded - 1003,bangl,cap
		
	}

}
