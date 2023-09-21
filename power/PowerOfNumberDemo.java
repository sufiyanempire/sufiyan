package com.kn.power;

public class PowerOfNumberDemo {
	public void power(int n1,int n2) {
		int temp=1;
		for(int i=1;i<=n2;i++) {
			temp=temp*n1;
		}
		System.out.println("The power of a given number is= "+temp);
	}

}
