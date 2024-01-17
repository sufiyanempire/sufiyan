package com.kn.selection;

public class MultipleApp {
	void multiple(int number) {
		if(number%8==0) {
			System.out.println("The given number "+number+" is divisible by 8");
		}
		else {
			System.err.println("The given number "+number+" is not divisible by 8");
		}
	}

}
