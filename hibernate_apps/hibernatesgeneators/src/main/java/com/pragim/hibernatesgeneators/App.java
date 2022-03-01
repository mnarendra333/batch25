package com.pragim.hibernatesgeneators;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.hibernatesgeneators.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	//open session - open local cache
    	Session session = sessionFactory.openSession();
    	
    	Product product = new Product();
    	//product.setId(102);
    	product.setProductName("hp-Dolby");
    	product.setPrice(61000);
    	product.setQty(10);
    	
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(product);
    	tx.commit();
    	//table created by hibernate
    	//insert into product_tab values(101,'Lenovo-Dolby',78000);
    }
}
