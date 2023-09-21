package com.kn.binary;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println("Enter a number");
		BinaryToDecimalDemo b1=new BinaryToDecimalDemo();
		b1.binary(number);
		scan.close();
	}

}
