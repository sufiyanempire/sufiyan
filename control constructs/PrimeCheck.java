package com.kn.selection;
import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		PrimeApp p1=new PrimeApp();
		p1.primeCheck(number);
		scan.close();
	}

}
