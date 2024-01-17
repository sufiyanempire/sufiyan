package com.kn.selection;
import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a color= ");
		String rainbow=scan.nextLine();
		RainbowApp r1=new RainbowApp();
		r1.rainbowCheck(rainbow);
		scan.close();
		
	}

}
