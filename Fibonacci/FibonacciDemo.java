package com.kn.Fibonacci;

public class FibonacciDemo {
	public void fibonacciCheck(int n) {
		int first = 0, second = 1, next = 0;
		if (n == 1) {
			System.out.println(first);
		} else if (n == 2) {
			System.out.println(first + " " + second);
		} else if(n>=3) {

			System.out.print(first + " " + second);
			for (int i = 3; i <= n; i++) {
				next = first + second;
				first = second;
				second = next;
				System.out.print(" " + second);
			}
		}
	}

}
