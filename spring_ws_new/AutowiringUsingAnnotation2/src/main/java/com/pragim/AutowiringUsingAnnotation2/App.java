package com.pragim.AutowiringUsingAnnotation2;

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
    	Person bean = ctx.getBean(Person.class);
    	bean.haveFood();
    	
    	
    	
    }
}
