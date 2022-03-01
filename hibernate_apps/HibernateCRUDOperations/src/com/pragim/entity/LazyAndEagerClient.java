package com.pragim.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LazyAndEagerClient {
	
	
	public static void main(String[] args) {
		
		//load and get method 
				//load - lazy loading 
				//get - eager loading
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		//load and get both are used for selecting single object from DB
		Actor actor = session.load(Actor.class, 101);
		System.out.println(actor.getAddress());

		
		//Single row operations 
		
		//load or get
		//save 
		//update
		//delete
		
		
		
		
	}

}
