package com.kn.selection;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		//for(int i=1;i<=number;i++) {
		//	System.out.print(i+" ");
//		}
		for(int i=number;i>=1;i--) {
			System.out.printf(i+" ");
		}
		scan.close();
	}

}
