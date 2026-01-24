package practiceproblems;
import java.util.Scanner;
public class Leap_year {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the year to check leap or not:");
	int year=sc.nextInt();
	
	if(year<1000 || year>=10000)
	{
		System.out.println("Enter valid year");
		return;
	}
	else if(year%400==0)
	{
		System.out.println("Leap year");
	}
	else if(year%100==0)
	{
		System.out.println("not a Leap year");
	}
	else if(year%4==0 )
	{
		System.out.println("Leap year");
	}
	else
	{
		System.out.println("Not a leap year");
	}
}
}
