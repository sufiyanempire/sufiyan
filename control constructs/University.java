package com.kn.selection;
import java.util.Scanner;

public class University {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=scan.nextInt();
		MarksApp n1=new MarksApp();
		n1.grade(marks);
		scan.close();
		
		
	}

}
