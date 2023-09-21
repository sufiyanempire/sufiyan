package com.kn.DigitCount;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		DigitCountDemo d1=new DigitCountDemo();
		d1.digitCount(number);
		scan.close();
	}

}
