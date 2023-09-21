package com.kn.power;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter base of a number: ");
		int base=scan.nextInt();
		System.out.print("Enter exponent of a number: ");
		int expo=scan.nextInt();
		PowerOfNumberDemo p1=new PowerOfNumberDemo();
		p1.power(base,expo);
		scan.close();
	}

}
