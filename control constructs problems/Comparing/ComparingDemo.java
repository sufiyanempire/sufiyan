package com.kn.Comparing;

public class ComparingDemo {
	public void comparing(int n1,int n2,int n3) {
		if(n1==n2&&n2==n3&&n3==n1) {
			System.out.println("All are equal");
		}
		else if(n1>n2&&n1>n3) {
			System.out.println(n1+" Is the largest number");
		}
		else if(n2>n1&&n2>n3) {
			System.out.println(n2+" Is the largest number");
		}
		else {
			System.out.println(n3+" Is the largest number");
		}
	}

}
