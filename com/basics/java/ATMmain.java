package com.java.abstractDemo;

import java.util.Scanner;



public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to USBank ATM");
		System.out.println("Please Enter choices");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		
		int choice= scanner.nextInt();
		
		
		Account account = null;
		
		if(choice ==1) {
			account = new Savings(4000);
			System.out.println("Please Enter Options");
			System.out.println("1.Withdrawl");
			System.out.println("2.Deposit");
			System.out.println("3.Fetch Balance");
			
			int option = scanner.nextInt();
			
			if(option == 1) {
				System.out.println("enter amount to withdraw");
				double amount = scanner.nextDouble();
				account.withdraw(amount);
			} else if(option == 2) {
				System.out.println("enter amount to deposit");
				double amount = scanner.nextDouble();
				account.deposit(amount);
			} else if(option == 3) {
				double balance  = account.getBalance();
				System.out.println("your current balance is " + balance);
				
			}
		} else if(choice ==2) {
			account = new Current(4000);
			System.out.println("Please Enter Options");
			System.out.println("1.Withdrawl");
			System.out.println("2.Deposit");
			System.out.println("3.Fetch Balance");
			
			int option = scanner.nextInt();
			
			if(option == 1) {
				System.out.println("enter amount to withdraw");
				double amount = scanner.nextDouble();
				account.withdraw(amount);
			} else if(option == 2) {
				System.out.println("enter amount to deposit");
				double amount = scanner.nextDouble();
				account.deposit(amount);
			} else if(option == 3) {
				double balance  = account.getBalance();
				System.out.println("your current balance is " + balance);
				
			}
		}
		
		scanner.close();
	}

}
