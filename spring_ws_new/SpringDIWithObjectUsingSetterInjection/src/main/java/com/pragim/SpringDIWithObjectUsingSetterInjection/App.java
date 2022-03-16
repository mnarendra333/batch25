package com.pragim.SpringDIWithObjectUsingSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        //create the object of spring container
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Employee emp = ctx.getBean(Employee.class);
        emp.getEmployeeInfo();
        
    }
}
