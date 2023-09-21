package com.kn.SidesOfPolygon;

public class SidesOfPolygonDemo {
	public String sidesOfPolygon(int a) {
		switch (a) {
		case 3:
			return "Triangle";
		case 4:
			return "Square";
		case 5:
			return "polygon";
		case 6:
			return "Hexagon";
		case 7:
			return "septagon";
		case 8:
			return "octagon";
		default:
				return "Invalid  sides";
		}	
	
	}
}
