package com.pragim.springdiwithpremetive;

public class PrintClass {
	
	
	private String message;
	//setter injection 
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Message is : "+message);
	}
	
	

}
