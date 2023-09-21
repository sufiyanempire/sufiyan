package com.kn.NumberEquality;

import java.util.Scanner;

public class NumberEquallity {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Number:");
		int number1=scan.nextInt();
		System.out.println("Enter second Number");
		int number2=scan.nextInt();
		System.out.println("Enter third Number");
		int number3=scan.nextInt();
		NumberEqualityDemo n1=new NumberEqualityDemo();
		n1.numberEquality(number1, number2, number3);
		scan.close();
	}

}
