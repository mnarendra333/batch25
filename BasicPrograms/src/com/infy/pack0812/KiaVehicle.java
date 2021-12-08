package com.infy.pack0812;


class Vehicle{
	
	
	public void printGears() {
		System.out.println("Vehicle-4 wheeler has 5 gears");
	}
	
}

public class KiaVehicle extends Vehicle{
	
	public void printGears() {
		System.out.println("Vehicle-4 wheeler has 6 gears");
	}
	
	
	public static void main(String[] args) {
		
		
		KiaVehicle obj = new KiaVehicle();
		obj.printGears();
		
		
	}

}
