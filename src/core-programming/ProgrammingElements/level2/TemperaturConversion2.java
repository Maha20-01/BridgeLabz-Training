package level2;

import java.util.Scanner;

public class TemperaturConversion2 {
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter emperature in Fahrenheit : ");
	    float farenheit=sc.nextFloat();
	    double FarenheitToCelcius=(farenheit-32)*5/9;
	    
	    System.out.printf(" the temperature in celcius %.2f",FarenheitToCelcius);
	    sc.close();
	}

}
