package com.kn.Unicode;

import java.util.Scanner;

public class Identification {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=scan.next().charAt(0);
		IdentificationDemo d1=new IdentificationDemo();
		d1.identification(ch);
		scan.close();
	}

}
