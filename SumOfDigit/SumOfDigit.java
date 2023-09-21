package com.kn.SumOfDigit;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		SumofDigitDemo s1=new SumofDigitDemo();
		s1.sumOfDigit(number);
		scan.close();
		
	}

}
