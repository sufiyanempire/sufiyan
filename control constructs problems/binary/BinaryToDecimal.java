package com.kn.binary;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		BinaryToDecimalDemo b1=new BinaryToDecimalDemo();
		b1.binary(number);
		scan.close();
	}

}
