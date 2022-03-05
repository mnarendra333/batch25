package com.howtodoinjava.hibernate.manyToMany;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.howtodoinjava.hibernate.manyToMany.joinTable.ReaderEntity;
import com.howtodoinjava.hibernate.manyToMany.joinTable.SubscriptionEntity;

public class DeleteSubFromReaderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		ReaderEntity readerEntity = session.get(ReaderEntity.class, 1);
		
		
		System.out.println(readerEntity.getReaderId()+" "+readerEntity.getFirstName()+" "+readerEntity.getLastName());
		Set<SubscriptionEntity> subscriptions = readerEntity.getSubscriptions();
		
		Iterator<SubscriptionEntity> iterator = subscriptions.iterator();
		
		while (iterator.hasNext()) {
			SubscriptionEntity subscriptionEntity =  iterator.next();
			if(subscriptionEntity.getSubscriptionName().equals("Horror")) {
				iterator.remove();
			}
			
		}
		tx.commit();

	}

}
