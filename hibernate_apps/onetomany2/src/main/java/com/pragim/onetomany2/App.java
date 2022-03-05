package com.pragim.onetomany2;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.onetomany2.entity.Customer;
import com.pragim.onetomany2.entity.Vendor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	
    	
    	//chailds
    	
    	Customer c1 = new Customer();
    	c1.setId(1005);
    	c1.setCustomerName("colabra");
    	c1.setCustomerAddress("bangl");
    	
    	Customer c2 = new Customer();
    	c2.setId(1006);
    	c2.setCustomerName("ntt");
    	c2.setCustomerAddress("bangl");
    	
    	Customer c3 = new Customer();
    	c3.setId(1007);
    	c3.setCustomerName("hcl");
    	c3.setCustomerAddress("bangl");
    	
    	//ctl+shift+o
    	Set<Customer> custList = new HashSet<Customer>();
    	
    	custList.add(c1);
    	custList.add(c2);
    	custList.add(c3);
    	
    	
    	Vendor v = new Vendor();
    	//parent data
    	v.setId(2);
    	v.setVendorName("IBM");
    	v.setVenAddr("bangl");
    	//child data
    	v.setCustomerList(custList);
    	
    	Transaction tx = session.beginTransaction();
    	session.save(v);
    	
    	tx.commit();
    	System.out.println("Done!!!");
    }
}
