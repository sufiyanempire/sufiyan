package com.kn.selection;
import java.util.Scanner;

public class PositiveCheck {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any number");
		int number=scan.nextInt();
		PositiveApp n1=new PositiveApp();
		EvenApp e1=new EvenApp();
		MultipleApp m1=new MultipleApp();
		n1.numberCheck(number);
		e1.evenCheck(number);
		m1.multiple(number);
		scan.close();
		
	}

}
