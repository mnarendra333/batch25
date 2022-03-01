package com.pragim.hibernatesgeneators;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class NativeSQLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to execute sql in hibernate ?
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		//ORM
		NativeQuery createSQLQuery = session.createSQLQuery("select * from stu");
		List<Object[]> list = createSQLQuery.list();
		for(Object[] row:list) {
			
			System.out.println(row[0]+" "+row[1]+ " "+row[2]);
			
		}
		
		//non-select
		NativeQuery createSQLQuery2 = session.createSQLQuery("update stu set stu_addr=?0 where stu_id=?1");
		createSQLQuery2.setParameter(0, "hyd").setParameter(1, 106);
		
		Transaction tx = session.beginTransaction();
		int executeUpdate = createSQLQuery2.executeUpdate();
		tx.commit();
		System.out.println("Done");
		
		//hql - select/non-select
		//criteria - deprecated
		//native sql - select/non-select
		
		
		

	}

}
