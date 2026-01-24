package practiceproblems;
import java.util.Scanner;
public class Largestnumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number 1");
	int number1=sc.nextInt();
	System.out.print("Enter number 2");
	int number2=sc.nextInt();
	System.out.print("Enter number 3");
	int number3=sc.nextInt();
	
	if(number1 > number2 &&number1> number3)
	{
		System.out.print("largest number is:" + number1+".");
	}
	if(number2 > number1 && number2>number3)
	{
		System.out.print("largest number is:" + number2+".");
	}
	if(number3 > number2 && number3>number1)
	{
		System.out.print("largest number is:" + number3+".");
	}
		
}
}
