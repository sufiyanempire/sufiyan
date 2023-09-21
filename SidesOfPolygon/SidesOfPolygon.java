package com.kn.SidesOfPolygon;

import java.util.Scanner;

public class SidesOfPolygon {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of sides");
		int sides=scan.nextInt();
		SidesOfPolygonDemo d1=new SidesOfPolygonDemo();
		System.out.println(d1.sidesOfPolygon(sides));
		scan.close();
	}

}
