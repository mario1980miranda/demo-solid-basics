package com.code.truck.solid.d.error;

/**
 * The Dependency inversion principle states that we should depend on abstractions (interfaces
 * and abstraction classes) instead of concrete implementation (classes). The abstractions should not
 * depend on details; instead, the details should depend on abstractions.
 * Consider the example :
 * We have a Car class {@link #Car(Engine)} that depends on the concrete class Engine; Therefore, 
 * this is not obeying the DIP.   
 */
public class Car {

	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.start();
	}
	
	/**
	 * The code will work, for now, but what if we wanted to add another engine type, let`s say a diesel
	 * engine? This will require refactoring the Car class. 
	 * 
	 */
	public static void main(String[] args) {
		Engine engine = new Engine();
		Car car = new Car(engine);
		car.start();		
	}
	
}

class Engine {
	public void start() { System.out.println("Engine start"); }
}
