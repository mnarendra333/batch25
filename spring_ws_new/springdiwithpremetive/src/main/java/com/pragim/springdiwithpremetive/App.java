package com.pragim.springdiwithpremetive;

import org.springframework.beans.factory.BeanFactory;
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
       //spring container will read all the beans from xml and register that beanswith spring container
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	//PrintClass- dependent
    	//message - 
    	PrintClass obj = ctx.getBean(PrintClass.class);
    	obj.printMessage();
    	
    }
}
