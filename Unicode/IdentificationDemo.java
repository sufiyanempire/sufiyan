package com.kn.Unicode;

public class IdentificationDemo {
	public void identification(char n1) {
		if (n1 >= 48 && n1 <= 57) {
			System.out.println("The given character "+n1+" is a digit");

		} else {
			if (n1 >= 65 && n1 <= 90) {
				switch (n1) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.println("The given character "+n1+"  is a uppercase vowel");
					break;
				default:
						System.out.println("The given character "+n1+"  is a uppercase consonent");
				}
			}
			else if(n1>=97 && n1<=122) {
				switch (n1) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("The given character "+n1+"  is a lowercase vowel");
					break;
				default:
					System.out.println("The given character "+n1+"  is a lowercase consonent");
				}
			}
		}
	}
}
