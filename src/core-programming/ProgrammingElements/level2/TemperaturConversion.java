package level2;
import java.util.Scanner;
public class TemperaturConversion {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature in Celsius: ");
	    float celsius=sc.nextFloat();
	    double celsiusToFarenheit=(celsius*9/5)+32;
	    
	    System.out.printf(" the temperature in Fahrenheit %.2f",celsiusToFarenheit);
	    sc.close();
	}

}
