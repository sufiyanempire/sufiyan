package com.kn.Reverse;

public class ReverseDemo {
	public void reverse(int num) {
		int digit=0,sum=0;
		while(num>0) {
			digit=num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		System.out.println("The reverse of a number is "+sum);
	}

}
