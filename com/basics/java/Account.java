package com.java.abstractDemo;

public abstract class Account {
	double balance;

	public Account(double balance) {

		this.balance = balance;
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	double getBalance() {
		return balance;
	}
}
