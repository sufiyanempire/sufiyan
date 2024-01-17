package com.kn.selection;
import java.util.Scanner;

public class VowelsOrConsonant {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//taking input from the user
		System.out.println("Enter any character");
		//initializing a variable
		char ch=scan.next().charAt(0);
		//calling a method
		checkVowelsOrConsonent(ch);
		scan.close();
		}

	public static void checkVowelsOrConsonent(char ch) {
		//checking vowel or not condition
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			//printing a vowel message
			System.out.println("Given alphabet "+ch+" is a vowel");
	}
		else {
			//printing a consonant message
			System.out.println("Given alphabet "+ch+" is a consonant");
		}
	}

}
