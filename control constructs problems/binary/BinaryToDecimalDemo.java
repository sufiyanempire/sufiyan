
package com.kn.binary;

import java.lang.Math;

public class BinaryToDecimalDemo {
	public void binary(int n) {
		int sum = 0, digit = 0, e = 0;
		while (n > 0) {
			digit = n % 10;
			if (digit == 1) {
				sum = sum + (int)Math.pow(2, e);
			}

			n = n / 10;
			e++;
		}
		System.out.println(sum);
	}

}
