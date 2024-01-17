import java.util.Scanner;

public class JoinStrings {
	public static String joinStrings(String a,String b) {
		return a+b;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//initialize the variables
		String s=scan.nextLine();
		String t=scan.nextLine();
		//calling a method
		String a=joinStrings(s,t);
		//print a result
		
		System.out.println(a);
		scan.close();
	}

}
