package com.code.truck.solid.i.fixed;

public class MyBike implements Vehicle {

	@Override
	public void drive() {
		System.out.println("I can drive my bike");
	}

	@Override
	public void stop() {
		System.out.println("I can stop my bike");
	}

}
