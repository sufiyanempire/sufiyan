import java.util.Scanner;

public class Double {
	public static int doubleTheNumber(int num1) {
		int a=num1*2;
		return a;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int c=scan.nextInt();
		int b=doubleTheNumber(c);
		System.out.println(b);
		scan.close();
	}

}
