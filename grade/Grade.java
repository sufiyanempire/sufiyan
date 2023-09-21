package com.kn.grade;

import java.util.Scanner;

public class Grade {
	//calculating the grade of a student
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a grade");
		//taking input from the user
		int grade=scan.nextInt();
		//calling a method
		GradeDemo d1=new GradeDemo();
		d1.grade(grade);
		scan.close();
	}

}
