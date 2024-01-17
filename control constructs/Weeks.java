package com.kn.selection;
import java.util.Scanner;

public class Weeks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int day=scan.nextInt();
		WeekFindOut w1=new WeekFindOut();
		w1.weekFindOutCheck(day);
		scan.close();
	}

}
