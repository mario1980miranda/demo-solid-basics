package com.code.truck.solid.i.error;

public interface Vehicle {
	void drive();
	void stop();
	void refuel();
	void openDoors();
}

class Bike implements Vehicle {
	
	@Override
	public void drive() {
		System.out.println("I can drive my bike.");
	}

	@Override
	public void stop() {
		System.out.println("I can stop my bike.");		
	}

	@Override
	public void refuel() {
		System.out.println("I am the fuel for my bike??? I suppose!");
	}

	@Override
	public void openDoors() {
		System.err.println("I can't do this. My bike does not have doors to be opened.");
	}

}

