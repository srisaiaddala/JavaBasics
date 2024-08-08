package com.oops.overloading;

public class Scholar {
	String name;
	String department;

	public Scholar(String name, String department) {
		this.name = name;
		this.department = department;
	}

	void printdetails() {
		System.out.println("Name" + name);
		System.out.println("Department" + department);

	}

	String getGrades(int[] marks) {
		int sum = 0;
		String result = "";
		// iterate the array using foreach
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}

		double average = sum / marks.length;

		System.out.println("average = " + average);

		if (average >= 90) {
			result = "Grade A";
		} else if (average >= 80) {
			result = "Grade B";
		} else if (average >= 70) {
			result = "Grade C";
		} else if (average >= 60) {
			result = "Grade D";
		} else if (average >= 50) {
			result = "Grade E";
		}
		return result;
		

	}
}
