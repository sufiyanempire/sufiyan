package com.kn.selection;

public class CalculatorApp {
	void arithmeticCheck(int number1,int number2,char operator) {
		if(operator=='+') {
			System.out.println("Addition of Two numbers "+number1+" and "+number2+" is "+(number1+number2));
		}
		else if(operator=='-'){
			System.out.println("subtraction of Two numbers "+number1+" and "+number2+" is "+(number1-number2));
		}
		else if(operator=='*') {
			System.out.println("Multiplication of Two numbers "+number1+" and "+number2+" is "+(number1*number2));
		}
		else if(operator=='/') {
			System.out.println("Division of Two numbers "+number1+" and "+number2+" is "+(number1/number2));
		}
		else if(operator=='%') {
			System.out.println("ModuloDivision of Two numbers "+number1+" and "+number2+" is "+(number1%number2)%.2f
					);
		}
		else {
			System.err.println("Not a valid option");
		}
	}
}
