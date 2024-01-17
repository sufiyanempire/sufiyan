import java.lang.Math;
import java.util.Scanner;

public class Cube {
	public static int cubeNumber(int power) {
		return power*3*3;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int cube=cubeNumber(num);
		System.out.println(cube);
		scan.close();
	}

}
