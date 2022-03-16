package com.pragim.SpringJdbc;

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
    	JdbcClient cleint = ctx.getBean(JdbcClient.class);
    	cleint.selectDataUsingRowMapperUsingConditionNamesParams();
    	
    }
}
