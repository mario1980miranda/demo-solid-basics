package com.code.truck.solid.o.fix;

public class Truck extends Vehicle {

	@Override
	public double calculateValue(Vehicle v) {
		return this.getValue() * 0.9;
	}

}
