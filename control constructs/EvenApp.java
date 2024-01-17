package com.kn.selection;

public class EvenApp {
	void evenCheck(int number) {
		if(number%2==0) {
			System.out.println("The given number "+number+" is even");
		}
		else {
			System.err.println("The given number "+number+" is odd");
		}
	}

}
