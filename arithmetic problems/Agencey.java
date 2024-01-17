import java.util.Scanner;

public class Agencey {
	public static int decodeCharcter(char ch) {
		return ch;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char a=scan.next().charAt(0);
		int decode=decodeCharcter(a);
		System.out.println(decode);
		scan.close();
	}

}
