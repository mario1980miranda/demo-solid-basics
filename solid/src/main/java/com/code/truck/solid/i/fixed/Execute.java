package com.code.truck.solid.i.fixed;

public class Execute {

	public static void main(String[] args) {
		Vehicle myBike = new MyBike();
		myBike.drive();
		myBike.stop();
		BikeAVelo aVeloBike = new BikeAVelo();
		aVeloBike.drive();
		aVeloBike.stop();
		aVeloBike.refuel();
		Car car = new Car();
		car.drive();
		car.stop();
		car.refuel();
		car.openDoors();
	}

}
