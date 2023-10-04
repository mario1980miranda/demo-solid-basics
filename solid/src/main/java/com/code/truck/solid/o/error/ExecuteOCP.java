package com.code.truck.solid.o.error;

public class ExecuteOCP {

	public static void main(String[] args) {
		
		VehicleCalculations vc = new VehicleCalculations();
		
		Car car = new Car();
		car.setValue(1d);
		
		Bike bike = new Bike();
		bike.setValue(1d);
		
		System.out.println("Car calculations: " + vc.calculateValue(car));
		System.out.println("Bike calculations: " + vc.calculateValue(bike));
	}

}
