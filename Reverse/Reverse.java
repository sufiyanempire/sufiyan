package com.kn.Reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		ReverseDemo d1=new ReverseDemo();
		d1.reverse(number);
		scan.close();
	}

}
