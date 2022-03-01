package com.pragim.client;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pragim.entity.Actor;

public class HQLFullObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		//sql and hql 
		
		// sql query built with table name and column names 
		//hql query built with class name and property names 
		System.out.println("======================full object-==============================");
		Query createQuery = session.createQuery("from Actor");
		List<Actor> list = createQuery.list();
		
		for (Actor actor : list) {
			System.out.println(actor);
		}
			
		//partial object from DB using HQL
		System.out.println("========================partial object===============================");
		Query createQuery2 = session.createQuery("select a.name,a.address from Actor a");
		List<Object[]> list2 = createQuery2.list();
		
		for (Object[] actor : list2) {
			System.out.println(actor[0]+" "+actor[1]);
		}
		

		//select single property from each row of a table
		System.out.println("==========================single column from each row=========================");
				Query createQuery3 = session.createQuery("select a.name from Actor a");
				List<String> list3 = createQuery3.list();
				
				for (String actorName : list3) {
					System.out.println(actorName);
				}
	}

}
