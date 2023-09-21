package com.kn.NumberEquality;

public class NumberEqualityDemo {
	public void numberEquality(int a,int b,int c) {
		if(a==b&&b==c&&c==a) {
			System.out.printf("The given number are equal");
		}
		else if(a>b&&a>c) {
			System.out.println("The given number "+a+" is greater");
		}
		else if(b>a&&b>c) {
			System.out.println("The given number "+b+" is greater");
		}
		else {
			System.out.println("The given number "+c+" is greater");
		}
	}

}
