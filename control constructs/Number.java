package com.kn.selection;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		if(num>0) {
			System.out.println("Given number " +num+" is a positive");
			scan.close();
		}
	}

}
