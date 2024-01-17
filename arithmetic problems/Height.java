import java.util.Scanner;

public class Height {
	public static double heightonvertor(double inches) {
		return inches/12;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your height");
		double height=scan.nextDouble();
		System.out.printf("%.2f",heightonvertor(height));
		scan.close();
		}

}
