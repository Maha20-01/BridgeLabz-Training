package level1;
import java.util.Scanner;
public class NaturalNumberss {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the natural numbers");
	int num=sc.nextInt();
	
	if(num<=0) {
		System.out.print("Enter a positive digit");}
		else {
	int sum=num*(num+1)/2;
	System.out.print("The sum of  natural numbers is"+sum);
	}
	}
}

