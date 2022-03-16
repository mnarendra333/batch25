package com.pragim.AutowiringUsingAnnotation2;

import org.springframework.stereotype.Component;

@Component
public class Restaurent {
	
	
	public String getMenuList() {
		
		return "1.Item-1\n2.Item-2\n3.Item-3\n4.Item-4";
	}

}
