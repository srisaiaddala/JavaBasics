package com.oops.overloading;

public class Shapemain {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calcarea(3);
		shape.calcarea(5f);
		int area = shape.calcarea(7,8);
		System.out.println("Rectangle"+area);
		
		System.out.println("Triangle"+shape.calcarea(9,8.1f));
	
		
		
		
	}
}
