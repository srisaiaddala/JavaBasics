package com.oops.overloading;

public class Student {
	
	
	String name,city;
	int studentId;
	

	public Student() {
		System.out.println("in default");
		
	}
	public Student( String name, int studentId) {
		this.name= name;
		this.studentId= studentId;
	
	}
	public Student(String name, String city, int studentId) {
		
		this.name = name;
		this.studentId = studentId;
		this.city = city;
	}
	void getdetails() {
		System.out.println("Name"+name);
		System.out.println("StudentId"+studentId);
		System.out.println("City"+city);
		
	
	}
	}
	
	