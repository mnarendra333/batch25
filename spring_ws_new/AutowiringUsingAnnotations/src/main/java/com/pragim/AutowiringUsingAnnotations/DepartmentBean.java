package com.pragim.AutowiringUsingAnnotations;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
	
	
	public String getDeptInfo() {
		
		return "Dept Info "+101+" "+"HR";
	}

}
