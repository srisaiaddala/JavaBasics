package com.java.abstractDemo;

public class Savings extends Account{
	public Savings(double balance) {
		super(balance);
	}
	@Override
	void withdraw(double amount) {
		System.out.println("Savings");
		balance = balance - amount;
		System.out.println("You have withdrawn "+amount);
		System.out.println("Your current balance is "+balance);

	}
	@Override
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("You have deposited "+amount);
		System.out.println("Your current balance is "+balance);
	}

	double getBalance() {
		return balance;
	}
}
