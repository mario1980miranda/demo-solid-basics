package com.code.truck.solid.o.fix;

public abstract class Vehicle {
	
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public abstract double calculateValue(Vehicle v);
}
