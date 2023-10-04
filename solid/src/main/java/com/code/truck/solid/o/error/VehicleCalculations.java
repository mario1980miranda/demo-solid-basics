package com.code.truck.solid.o.error;

public class VehicleCalculations {

	public double calculateValue(Vehicle v) {
		
		if (v instanceof Car) {
			return v.getValue() * 0.8;
		}
		if (v instanceof Bike) {
			return v.getValue() * 0.5;
		}
		return 0;
		
	}
}
