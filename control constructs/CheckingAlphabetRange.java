package com.kn.selection;
import java.util.Scanner;

public class CheckingAlphabetRange {

	public static void main(String[] args) {
		//taking input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any alphabet");
		//initializing a variable
		char alphabet=scan.next().charAt(0);
		//calling a method
		checkingAlphabetRange(alphabet);
		scan.close();
	}

	public static void checkingAlphabetRange(char alphabet) {
		//checking the condition 
		if(alphabet>=65&&alphabet<=90) {
			//printing the upper case letters
			System.out.println("it is in upper case");
		}
		else {
			//printing the lower case letters
			System.out.println("It is in lower case");
		}
	}

}
