package com.code.truck.solid.d.fixed;

public class Car {

	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		this.engine.start();
	}
	
	public static void main(String[] args) {
		Engine petrol = new PetrolEngine();
		Car car1 = new Car(petrol);
		car1.start();
		Engine diesel = new DiesilEngine();
		Car car2 = new Car(diesel);
		car2.start();
	}

}

interface Engine {
	public void start();
}

class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Petrol engine start");
	}
	
}

class DiesilEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Diesil engine start");
	}
	
}