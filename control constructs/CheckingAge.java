package com.kn.selection;
import java.util.Scanner;

public class CheckingAge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		VoteApp e1=new VoteApp();
		e1.eligibility(age);
		scan.close();
	}

}
