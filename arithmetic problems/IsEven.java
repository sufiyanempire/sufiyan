import java.util.Scanner;

public class IsEven {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		isPositive(num);
		scan.close();
	}
	public static void isPositive(int n) {
		for (int i = 1; i <= n/2; i++) {
			if (i%2 == 0 && n > 0) {
				System.out.println("positive and even");
				break;
			}
		}
	}
}
