package com.kn.selection;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		scan.close();
		int flag = 0,i;
		for ( i = 2; i <= number/2;i++) {
			if (number % i == 0) {
				flag++;
				break;
			}
		}
		if(flag==0) {
			System.out.println("it is a prime");
			System.out.println(i);
		}
		else {
			System.out.println("not a prime");
			System.out.println(i);
		}
		
	}

}
