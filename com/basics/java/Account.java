package com.inheritance.assignment;

public class Account {
	double balance;

	public Account(double balance) {

		this.balance = balance;
	}

	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("You have withdrawn "+amount);
		System.out.println("Your current balance is "+balance);

	}

	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("You have deposited "+amount);
		System.out.println("Your current balance is "+balance);
	}

	double getBalance() {
		return balance;
	}
}
