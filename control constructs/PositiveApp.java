package com.kn.selection;

public class PositiveApp {
	void numberCheck(int number) {
		if(number==0 || number>=0) {
			System.out.println("Given numbr "+number+" is positive");
		}
		else {
			System.err.println("Negative number");
		}
	}

}
