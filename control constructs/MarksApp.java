package com.kn.selection;

public class MarksApp {
	void grade(int marks) {
		if(marks<35) {
			System.err.println("Your are fail");
		}
		else if(marks>=35 && marks<=60) {
			System.out.println("C Grade");
		}
		else if(marks>=61 && marks<=75) {
			System.out.println("B Grade");
		}
		else {
			System.out.println("A Grade");
		}
	}

}
