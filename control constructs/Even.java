package com.kn.selection;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//taking input from the user
		System.out.println("Enter any number");
		//initializing the input
		int number=scan.nextInt();
		//calling a method
		evenOrOdd(number);
		scan.close();
		}

	public static void evenOrOdd(int number) {
		//checking the condition for even or odd
		if(number%2==0) {
			//printing even numbers
			System.out.println("The given number "+number+" is even");
	}
		else {
			//printing a odd numbers
			System.out.println("The given number "+number+" is odd");
		}
	}

}
