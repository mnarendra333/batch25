package com.pragim.AutowiringUsingXML;

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
        EmployeeBean bean = ctx.getBean(EmployeeBean.class);
        bean.getEmployeeBeanInfo();
    }
}
