package com.code.truck.solid.i.fixed;

public class Car implements Vehicle, VehicleWithEngine, VehiacleWithDoors {

	@Override
	public void openDoors() {
		System.out.println("I can open it's doors.");
	}

	@Override
	public void refuel() {
		System.out.println("I can refuel this car.");		
	}

	@Override
	public void drive() {
		System.out.println("I can drive this car.");
	}

	@Override
	public void stop() {
		System.out.println("I can stop this car.");
	}

}
