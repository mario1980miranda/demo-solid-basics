package com.code.truck.solid.l.error;

public class Rectangle {

	private double heigth;
	private double width;
	
	public void setHeigth(double heigth) {
		System.out.println("Class Rectangle Set Heigth to: " + heigth);
		this.heigth = heigth;
	}
	public void setWidth(double width) {
		System.out.println("Class Rectangle Set Width to: " + width);
		this.width = width;
	}
	public double getHeigth() {
		return heigth;
	}
	public double getWidth() {
		return width;
	}
	
}
