package com.infy.pack0912;

abstract class Bike{
	
	
	public void changeGear() {
		System.out.println("gear changed");
	}
	
	public abstract  void run();
	
	
}


class Honda extends Bike{

	static int x = 30;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda - Run method");
		
	}

	
}
 class Hero extends Bike{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hero - Run method");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(Honda.x);
		
		Honda obj = new Honda();
		obj.changeGear();
		obj.run();
		
		Hero heroObj = new Hero();
		heroObj.changeGear();
		heroObj.run();
		
		
		
		
	}

	
}
