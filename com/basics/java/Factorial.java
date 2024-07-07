package com.basics.java;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		int sum = 1;
		
		for (int i=1;i<=num; i++) {
			    sum = sum*i ;
			   
			}
		System.out.println(sum);
		
		

	}

}
