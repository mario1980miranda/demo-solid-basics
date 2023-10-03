package com.code.truck.solid.i.fixed;

public class BikeAVelo implements Vehicle, VehicleWithEngine {

	@Override
	public void refuel() {
		System.out.println("Bike AVelo has an electric engine.");
	}

	@Override
	public void drive() {
		System.out.println("I can drive this bike.");
	}

	@Override
	public void stop() {
		System.out.println("I can stop this bike.");
	}

}
