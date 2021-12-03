package com.infy.pack2;

public class Actor {
	
	
	int id;
	String name;
	int age;
	String role;
	
	
	
	public Actor(int id, String name, int age, String role)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.role = role;
	}
	
	
	


	public static void main(String[] args) {
		
		
		Actor obj1 = new Actor(1,"Sharuk",45,"hero");
		System.out.println(obj1.id+" "+obj1.name+" "+obj1.age+" "+obj1.role);
		
		
		Actor obj2 = new Actor(2,"Anil",55,"hero");
		System.out.println(obj2.id+" "+obj2.name+" "+obj2.age+" "+obj2.role);
		
		
		
		//what are diff constructors vaialble 
		
		
	}
	
	
	
	
	

}
