import java.util.Scanner;

public class Converter {
	public static double temperatureConverter(double fahrenheit) {
		return (fahrenheit-32)*5/9;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temperature in celsius");
		double celsius=scan.nextDouble();
		double temperatureconverter=temperatureConverter(celsius);
		System.out.println("temperature is converted to fahrenheit="+temperatureconverter);
		scan.close();
		
		}

}
