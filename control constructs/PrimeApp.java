package com.kn.selection;

public class PrimeApp {
	void primeCheck(int number) {
		int flag=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The given number "+number+" is prime");
		}
		else {
			System.out.println("The given number "+number+" is not a prime");
		}
	}
}
