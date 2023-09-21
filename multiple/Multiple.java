package com.kn.multiple;

import java.util.Scanner;

public class Multiple {
//calculating the multiple of 10
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter a number");
		int number=scan.nextInt();
		//creating a object
		MultipleDemo m1=new MultipleDemo();
		//calling a method
		
		m1.multiple(number);
		//closing a scanner class
		scan.close();
	}

}
