package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//connection setting
		//hibernate settings
		//mapping files 
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		//enable the local cache
		Session session = factory.openSession();
		
		Student stu = new Student();
		stu.setId(106);
		stu.setName("jeevan");
		stu.setAddress("bangl");
		
		Transaction tx = session.beginTransaction();
		session.save(stu);
		tx.commit();
		System.out.println("saved!");

	}

}
