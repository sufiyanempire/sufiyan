package com.ln.leapyear;

public class LeapYearDemo {
	public void leapyear(int n1) {
		if (n1 % 4 == 0) {
			if (n1 % 100 == 0) {
				if (n1 % 400 == 0) {
					System.out.println("It is a leapyear");
				} else {
					System.out.println("It is not a leapyear");
				}
			}
			System.out.println("It is a leapyear");
		}
		else {
			System.out.println("It is not a leap year");
		}
		
	}

}
