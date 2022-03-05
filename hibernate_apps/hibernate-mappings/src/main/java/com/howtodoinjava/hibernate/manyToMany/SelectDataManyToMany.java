package com.howtodoinjava.hibernate.manyToMany;

import java.util.Set;

import org.hibernate.Session;

import com.howtodoinjava.hibernate.manyToMany.joinTable.ReaderEntity;
import com.howtodoinjava.hibernate.manyToMany.joinTable.SubscriptionEntity;

public class SelectDataManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		/*ReaderEntity readerEntity = session.get(ReaderEntity.class, 1);
		System.out.println(readerEntity.getReaderId()+" "+readerEntity.getFirstName()+" "+readerEntity.getLastName());
		Set<SubscriptionEntity> subscriptions = readerEntity.getSubscriptions();
		
		
		for (SubscriptionEntity subscriptionEntity : subscriptions) {
			System.out.println(subscriptionEntity.getSubscriptionName()+" "+subscriptionEntity.getSubscriptionId());
		}*/
		
		SubscriptionEntity subscriptionEntity = session.get(SubscriptionEntity.class, 1);
		System.out.println(subscriptionEntity.getSubscriptionName()+" "+subscriptionEntity.getSubscriptionId());
		
		
		Set<ReaderEntity> readers = subscriptionEntity.getReaders();
		for (ReaderEntity readerEntity : readers) {
			System.out.println(readerEntity.getReaderId()+" "+readerEntity.getFirstName()+" "+readerEntity.getLastName());
		}
		
		//many to many ..we have to prove one to many from both the sides 
		
	}

}
