package com.kn.SumOfDigit;

public class SumofDigitDemo {
	public void sumOfDigit(int number) {
		int sum = 0, digit = 0;
		for (int i = 0; number > 0; i++) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println(sum);
	}

	
}
