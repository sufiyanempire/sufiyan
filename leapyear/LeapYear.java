package com.ln.leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		LeapYearDemo l1=new LeapYearDemo();
		l1.leapyear(number);
		scan.close();
	}

}
