package com.kn.DigitCount;

public class DigitCountDemo {
	public void digitCount(int number) {
		int digit=0,count=0;
		for(int i=0;number>0;i++) {
			digit=digit%10;
			count++;
			number=number/10;
		}
		System.out.println(count);
	}

}
