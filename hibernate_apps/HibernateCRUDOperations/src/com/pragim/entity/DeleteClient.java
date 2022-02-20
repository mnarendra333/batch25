package com.pragim.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Actor actor = session.get(Actor.class, 101);
		Transaction tx = session.beginTransaction();
		session.delete(actor);
		tx.commit();

	}

}
