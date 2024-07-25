package com.shristi.training;

public class Mobile {
	String model;
	int version;
	String brand;
	String battery;
	
	
	public Mobile(String model, int version, String brand, String battery) {
		
		this.model = model;
		this.version = version;
		this.brand = brand;
		this.battery = battery;
	}
	void printMobileDetails() {
		System.out.println("Model"+model);
		System.out.println("Version"+version);
		System.out.println("Brand"+brand);
		System.out.println("Battery"+battery);
	}
} 	

