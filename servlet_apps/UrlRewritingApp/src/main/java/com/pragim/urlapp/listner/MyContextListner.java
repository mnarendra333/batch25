package com.pragim.urlapp.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyContextListner
 *
 */
public class MyContextListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
	long startTime,endTime;
    public MyContextListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("My Application stopped ");
        endTime = System.currentTimeMillis();
        System.out.println("Application is active for "+(endTime-startTime));
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
        System.out.println("My Application started ");
        startTime = System.currentTimeMillis();
        
        
        
    }
	
}
