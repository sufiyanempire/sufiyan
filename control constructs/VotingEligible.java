package com.kn.selection;
import java.util.Scanner;

public class VotingEligible {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		//taking input from the user
		System.out.println("Enter your age");
		//initialize a variable
		int age=scan.nextInt();
		//calling a method
		char gender=scan.next().charAt(0);
		checkIfEligibleForVoting(age,gender);
		scan.close();
	}

	private static void checkIfEligibleForVoting(int age,char gender) {
		//checking the eligibility
		if(age>=18) {
			//printing a success message
			System.out.println("Eligible for voting");
		}
		else if(age<=18 && gender=='m')
		{
			System.out.println("Chota baccha ho ky??");
			System.out.println("Not eligible for voting");
		}
		else {
			//printing failure test case
			System.out.println("Choti bacchi ho ky??");
			System.out.println("Not eligible for voting");
		}
	}
}

