package com.kn.selection;

public class FindRainbowColor {
	void rainbowcheck(char rainbow){
		switch(rainbow) {
		case 'v':
		case 'V':{
			System.err.println("Violet color");
			break;
		}
		case 'i':
		case 'I':{
			System.err.println("Indigo color");
			break;
		}
		case 'b':
		case 'B':{
			System.err.println("Blue color");
			break;
		}
		case 'g':
		case 'G':{
			System.err.println("Green color");
			break;
		}
		case 'y':
		case 'Y':{
			System.err.println("Yellow color");
			break;
		}
		case 'o':
		case 'O':{
			System.err.println("Orange color");
			break;
		}
		case 'r':
		case 'R':{
			System.err.println("Red color");
			break;
		}
		default:
			System.err.println("Invalid color");
		}
			
	}
}
