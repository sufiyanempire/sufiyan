package com.kn.factors;

public class FactorsDemo {
	public void factors(int number) {
		for(int i=1;i<=number;i++) {
			if(number%1==0) {
				System.out.print(i+" ");
			}
		}
	}

}
