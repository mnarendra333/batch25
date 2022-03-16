package com.pragim.AutowiringUsingAnnotation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	
	  @Autowired 
	  private Restaurent restaurent;
	 

	@Autowired
	private University university;

	

	public void haveFood() {
		//String menu = restaurent.getMenuList();
		//System.out.println(menu);
		university.getUnivInfo();
	}

}
