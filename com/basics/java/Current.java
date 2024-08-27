package com.java.abstractDemo;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Current account");
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



