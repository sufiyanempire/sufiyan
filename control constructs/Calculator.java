package com.kn.selection;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First number= ");
		int number1=scan.nextInt();
		System.out.println("Enter second number= ");
		int number2=scan.nextInt();
		System.err.println("Enter your choice\n+ ==> Addition\n- ==> subtraction\n* ==> Multiplication\n/ ==> Division\n% ==> Modulo Division");
		char operator=scan.next().charAt(0);
		CalculatorApp a1=new CalculatorApp();
		a1.arithmeticCheck(number1,number2,operator);
		scan.close();
	}

}
