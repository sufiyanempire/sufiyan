import java.util.Scanner;

public class JourneyCalculator {
	public static double journey(int speed,double time) {
		return speed*time;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed");
		int speed=scan.nextInt();
		System.out.println("Enter time");
		double time=scan.nextDouble();
		double travelled=journey(speed,time);
		System.out.println("Distance travelled="+travelled);
		scan.close();
	}

}
