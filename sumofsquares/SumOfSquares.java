package com.kn.sumofsquares;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		SumOfSquareDemo s1=new SumOfSquareDemo();
		s1.sumOfSquare(number);
		scan.close();
	}

}
