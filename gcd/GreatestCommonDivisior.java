package com.kn.gcd;

import java.util.Scanner;

public class GreatestCommonDivisior {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int number=scan.nextInt();
		System.out.println("Enter second number");
		int number2=scan.nextInt();
		GreatestCommonDivisiorDemo d1=new GreatestCommonDivisiorDemo();
		d1.greatestCommomDivisior(number,number2);
		scan.close();
	}

}
