package com.kn.Armstrong;

import java.lang.Math;

public class ArmStrongDemo {
	public void armstrong(int n) {
		int digit = 0, sum = 0,temp=n;
		while( n > 0) {
			digit = n % 10;
			sum = sum + (int) Math.pow(digit, 3);
			n = n / 10;
		}
		if(temp==sum) {
		System.out.println("The Given number "+temp+" is an Armstrong number");
		}
		else {
			System.out.println("The Given number "+temp+" Not an armstrong number");
		}
	}
}