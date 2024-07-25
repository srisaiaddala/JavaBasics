package com.shristi.training;

public class Employee {
	String employeeName;
	int employeeId;
	String department;
	double salary;
	
	Employee (String employeeName, int employeeId, String department, double salary){
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.department=department;
		this.salary=salary;
		
		
	}
	void employeedetails() {
		System.out.println("Name"+ employeeName);
		System.out.println("EmployeeId"+employeeId);
		System.out.println("Department"+department);
		System.out.println("Salary"+salary);
	}
	
}
