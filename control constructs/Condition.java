package com.kn.selection;
import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		
		scan.close();
	}

}
