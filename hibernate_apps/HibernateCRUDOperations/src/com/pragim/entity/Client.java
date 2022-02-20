package com.pragim.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Actor actor = new Actor();
		actor.setId(101);
		actor.setName("nani");
		actor.setAddress("hyd");

		Transaction tx = session.beginTransaction();
		session.save(actor);
		tx.commit();
		
		
		
	}

}
