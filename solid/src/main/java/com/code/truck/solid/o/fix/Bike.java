package com.code.truck.solid.o.fix;

public class Bike extends Vehicle {

	@Override
	public double calculateValue(Vehicle v) {
		return this.getValue() * 0.5;
	}

}
