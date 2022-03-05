package com.pragim.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pragim.manytomany.entity.Employee;
import com.pragim.manytomany.entity.Project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	
    	
    	Employee e1 = new Employee();
    	e1.setId(10001);
    	e1.setEmpName("John");
    	e1.setEmpAddr("bangl");
    	
    	
    	Employee e2 = new Employee();
    	e2.setId(10002);
    	e2.setEmpName("clerk");
    	e2.setEmpAddr("sydney");
    	
    	
    	Set<Employee> empList = new HashSet<Employee>();
    	empList.add(e1);
    	empList.add(e2);
    	
    	
    	Project p1 = new Project();
    	p1.setpId(500);
    	p1.setProjName("PortalCart");
    	p1.setMembers(15);
    	
    	
    	p1.setEmpList(empList);
    	
    	
    	session.save(p1);
    	tx.commit();
    	
    	
    	
    }
}
