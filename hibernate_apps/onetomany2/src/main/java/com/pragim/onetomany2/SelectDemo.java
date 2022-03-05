package com.pragim.onetomany2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pragim.onetomany2.entity.Customer;
import com.pragim.onetomany2.entity.Vendor;

public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	
    	//loaded single object 
    /*	Vendor vendor = session.get(Vendor.class, 1); //1+1
    	System.out.println("Vendor Data \n "+vendor.getId()+" "+vendor.getVendorName()+" "+vendor.getVenAddr());
    	
    	Set<Customer> customerList = vendor.getCustomerList();
    	for(Customer customer:customerList)
    		System.out.println(customer.getId()+" "+customer.getCustomerName()+" "+customer.getCustomerAddress());
	*/
	
    	//load all objects 
    	Query query = session.createQuery("from Vendor"); // 1+n =>

    	//2p => 1+2
    	//4p => 1+4 
    	List<Vendor> list = query.list();
    	
    	for(Vendor ven:list) {
    		System.out.println("parent data "+ven.getId()+" "+ven.getVendorName()+" "+ven.getVenAddr());
    		
    		Set<Customer> customerList2 = ven.getCustomerList();
    		for (Customer cust : customerList2) {
				System.out.println("customer data "+cust.getId()+" "+cust.getCustomerName()+" "+cust.getCustomerAddress());
			}
    	}
    	
    	// parent - child -> 
    	
    	// customer c = new Customer();
    	
	
	}

}
