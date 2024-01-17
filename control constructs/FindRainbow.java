package com.kn.selection;
import java.util.Scanner;

public class FindRainbow {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char rainbow=scan.next().charAt(0);
		FindRainbowColor f1=new FindRainbowColor();
		f1.rainbowcheck(rainbow);
		scan.close();
	}

}
