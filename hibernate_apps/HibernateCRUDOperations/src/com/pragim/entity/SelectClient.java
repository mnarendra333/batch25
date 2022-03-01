package com.pragim.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Actor actor = session.get(Actor.class, 101);
		System.out.println(actor);
		
		Actor actor2 = session.get(Actor.class, 101);
		System.out.println(actor2);
		
		
		Actor actor3 = session.get(Actor.class, 101);
		System.out.println(actor3);
		
		
		
		//load and get method 
		//load - lazy loading 
		//get - eager loading
		
		
		

	}

}
