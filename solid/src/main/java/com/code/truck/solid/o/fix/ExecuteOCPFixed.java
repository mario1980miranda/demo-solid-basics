package com.code.truck.solid.o.fix;

public class ExecuteOCPFixed {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setValue(1.0);
		
		System.out.println(">>> Car calculate value: " + car.calculateValue(car));
		
		Bike bike = new Bike();
		bike.setValue(1.0);
		
		System.out.println(">>> Bike calculate value: " + bike.calculateValue(car));
		
		Truck truck = new Truck();
		truck.setValue(1.0);
		
		System.out.println(">>> Truck calculate value: " + truck.calculateValue(car));
	}
}
