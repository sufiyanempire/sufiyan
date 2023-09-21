package com.kn.factors;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		FactorsDemo d1=new FactorsDemo();
		d1.factors(number);
		scan.close();
	}

}
