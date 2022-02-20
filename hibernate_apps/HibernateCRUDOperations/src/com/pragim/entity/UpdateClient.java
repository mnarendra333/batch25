package com.pragim.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateClient {
	
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Actor actor = session.get(Actor.class, 101);
		actor.setAddress("bangl");
		Transaction tx = session.beginTransaction();
		session.update(actor);
		tx.commit();
		
		
		
		
		
		
	}

}
