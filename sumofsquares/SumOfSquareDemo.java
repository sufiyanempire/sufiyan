package com.kn.sumofsquares;

public class SumOfSquareDemo {
	public void sumOfSquare(int n1) {
		int sum=0;
		for(int i=1;i<=n1;i++) {
			sum=sum+i*i;
		}
		System.out.println(sum);
	}

}
