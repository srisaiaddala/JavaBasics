package com.oops.overloading;

public class Shape {
	void calcarea(int side) {
		System.out.println("square"+side*side);
	}
	void calcarea(float radius) {
		System.out.println("circle"+Math.PI *radius*radius);
		
		
	}
	int calcarea(int length, int breadth) {
		return(length * breadth);
		
	}
	double calcarea(int height, float length) {
		return 0.5*height*length;
		
	}

}
