package com.kn.ControlConstructProblems;

import java.util.Scanner;

public class Purchase {
//to check weather discount is applicable or not
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the price Amount: ");
		//reading the input from the user
		double price=scan.nextDouble();
		//creating a object 
		PurchaseDemo d1=new PurchaseDemo();
		//calling a method  
		d1.discount(price);
		//closing a scanner class
		scan.close();
		
	}

}
