package com.kn.selection;
import java.util.Scanner;

public class Kodneat {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		TechClub w1=new TechClub();
		System.out.println("Welcome to kodnest");
		System.out.println("Enter your cgpa");
		double cgpa=scan.nextDouble();
		w1.welcome(cgpa);
		scan.close();
	}

}
