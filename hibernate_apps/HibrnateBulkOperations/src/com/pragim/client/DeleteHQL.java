package com.pragim.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		Query createQuery = session.createQuery("delete from Actor a where a.id=?1");
		createQuery.setParameter(1, 103);
		createQuery.executeUpdate();
		beginTransaction.commit();
		

	}

}
