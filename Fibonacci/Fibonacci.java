package com.kn.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		FibonacciDemo d1=new FibonacciDemo();
		d1.fibonacciCheck(number);
		scan.close();
	}

}
