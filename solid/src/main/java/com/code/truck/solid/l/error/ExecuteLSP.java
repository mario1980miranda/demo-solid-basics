package com.code.truck.solid.l.error;

public class ExecuteLSP {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.setHeigth(2.0);
		r.setWidth(3.0);
		System.out.println(String.format(">> Rectangle : w: %s, h: %s. <<", r.getHeigth(), r.getWidth()));
		
		Square s = new Square();
		s.setHeigth(2.0);
		s.setWidth(3.0);
		
		System.out.println(String.format(">> Square : w: %s, h: %s. <<", s.getHeigth(), s.getWidth()));
		
	}

}
