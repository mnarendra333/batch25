package com.infy.pack1012;

import java.util.Date;

public class KiaVehicle implements EngineDesign, GearDesign {

	@Override
	public void changeGear() {
		System.out.println("inside changeGear method");

	}

	@Override
	public void startEngine() {
		System.out.println("inside startEngine method");

	}
	
	
	public static void main(String[] args) {
		
	
		
		
		KiaVehicle obj = new KiaVehicle();
		obj.changeGear();
		obj.startEngine();
		
		System.out.println(new Date().toString());
		
		
		String s1 = "hello";
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer sbrev = sb.reverse();
		String str = sbrev.toString();
		System.out.println(str);
		
		
		System.out.println(new StringBuffer(s1).toString());
		
		
		
		
		
		
		
	}

}
