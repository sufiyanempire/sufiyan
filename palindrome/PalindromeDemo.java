package com.kn.palindrome;

public class PalindromeDemo {
	public void palindrome(int num) {
		int sum=0,digit=0,temp=num;
		while(num>0) {
			digit =num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("The given number "+temp+" is a palindrome");
		}
		else {
			System.out.println("The given number "+temp+" is not a palindrome");
		}
	}

}
