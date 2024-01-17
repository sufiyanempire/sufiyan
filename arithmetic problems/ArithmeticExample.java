import java.util.Scanner;

public class ArithmeticExample {
	public static int subtractNumbers(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1,int num2) {
		return num1*num2;
	}
	public static double divideNumbers(double num1,double num2) {
		return num1/num2;
	}
	public static int findRemainderNumbers(int num1,int num2) {
		return num1%num2;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sub=subtractNumbers(num1,num2);
		System.out.println(sub);
		int mul=multiplyNumbers(num1,num2);
		System.out.println(mul);
		double div=divideNumbers(num1,num2);
		System.out.println(div);
		double rem=findRemainderNumbers(num1,num2);
		System.out.println(rem);
		scan.close();
	}

}
