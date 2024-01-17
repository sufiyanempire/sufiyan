import java.util.Scanner;

public class Intrest {
	public static double simpleIntrest(double price,double intrest,double time) {
		return price*intrest*time;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter amount");	
		double price=scan.nextDouble();
		System.out.println("Enter intrest");
		double intrest=scan.nextDouble();
		System.out.println("Enter time");
		double time=scan.nextDouble();
		System.out.println("Your Intrest is "+simpleIntrest(price,intrest,time));
		scan.close();
	}

}
