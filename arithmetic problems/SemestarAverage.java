import java.util.Scanner;

public class SemestarAverage {
	public static double calculateAverage(int sem1,int sem2,int sem3,int sem4,int sem5,int sem6,int sem7,int sem8) {
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter sem1 marks");
		int sem1=scan.nextInt();
		System.out.println("Enter sem2 marks");
		int sem2=scan.nextInt();
		System.out.println("Enter sem3 marks");
		int sem3=scan.nextInt();
		System.out.println("Enter sem4 marks");
		int sem4=scan.nextInt();
		System.out.println("Enter sem5 marks");
		int sem5=scan.nextInt();
		System.out.println("Enter sem6 marks");
		int sem6=scan.nextInt();
		System.out.println("Enter sem7 marks");
		int sem7=scan.nextInt();
		System.out.println("Enter sem8 marks");
		int sem8=scan.nextInt();
		double average=calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		System.out.printf("%.2f",average);
		scan.close();
	}

}
