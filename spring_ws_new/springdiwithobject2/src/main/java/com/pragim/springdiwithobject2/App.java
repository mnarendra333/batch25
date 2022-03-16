package com.pragim.springdiwithobject2;

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
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	Student stuObj = ctx.getBean(Student.class);
    	
    	stuObj.getStudentInfo();
    	
    }
}
