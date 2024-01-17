package com.kn.selection;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int r=n%10;
		int a=n/10;
		int b=a%10;
		int c=a/10;
		System.out.print(r);
		System.out.print(b);
		System.out.print(c);
		scan.close();
		
	}

}
