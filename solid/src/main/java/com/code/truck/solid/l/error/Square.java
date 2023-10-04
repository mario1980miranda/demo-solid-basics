package com.code.truck.solid.l.error;

public class Square extends Rectangle {

	public void setHeigth(double heigth) {
		super.setHeigth(heigth);
		super.setWidth(heigth);
	}
	
	public void setWidth(double width) {
		super.setWidth(width);
		super.setHeigth(width);
	}
}
