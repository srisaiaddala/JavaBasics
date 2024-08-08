package com.oops.overloading;

import java.util.Scanner;

public class ScholarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = scanner.next();
		System.out.println("Enter student department");
		String department= scanner.next();
		System.out.println("Enter student marks");
		int [] marks = new int[5];
		
		for(int i=0;i<marks.length;i++) {
			marks[i] = scanner.nextInt();
		}
		
		Scholar scholar = new Scholar(name,department);
		
		scholar.printdetails();
		System.out.println( scholar.name + " " + scholar.getGrades(marks));
		
		scanner.close();
	}

}
