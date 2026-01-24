package practiceproblems;
import java.util.Scanner;
public class Oddoreven {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to check");
	int check=sc.nextInt();

	if(check%2==0)
	{
		System.out.println("the number "+check+" is even");
	}else {
		System.out.println("the number "+check+ " is odd number");
	}
}
}
