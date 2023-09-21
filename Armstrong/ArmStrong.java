package com.kn.Armstrong;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		ArmStrongDemo a1=new ArmStrongDemo();
		a1.armstrong(number);
		scan.close();
	}

	
}
