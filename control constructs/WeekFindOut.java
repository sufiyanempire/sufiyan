package com.kn.selection;

public class WeekFindOut {
	void weekFindOutCheck(int day) {
		if(day==1) {
			System.err.println("Sunday");
		}
		else if(day==2) {
			System.err.println("Monday");
		}
		else if(day==3) {
			System.err.println("Tuesday");
		}
		else if(day==4) {
			System.err.println("wednesday");
		}
		else if(day==5) {
			System.err.println("Thursday");
		}
		else if(day==6) {
			System.err.println("Friday");
		}
		else if(day==7) {
			System.err.println("Saturday");
		}
		else {
			System.err.println("Not a day or Not a vaild Number");
		}
	}
}
