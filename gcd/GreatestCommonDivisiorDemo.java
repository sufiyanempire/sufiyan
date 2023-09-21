package com.kn.gcd;

public class GreatestCommonDivisiorDemo {
	public void greatestCommomDivisior(int n1,int n2) {
		int gcd=1;
		for(int i=1;i<=n1&&i<n2;i++) {
			if(n1%i==0&&n2%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD of given number is "+gcd);
	}

}
