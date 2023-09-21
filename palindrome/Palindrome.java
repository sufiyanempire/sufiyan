package com.kn.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		PalindromeDemo p1=new PalindromeDemo();
		p1.palindrome(number);
		scan.close();
	}

}
