package level1;
import java.util.Scanner;
public class CheckNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check : ");
		int num=sc.nextInt();
		
		
		if(num>=1)
		{
			System.out.print("The number is positive integer");
		}
		else if(num<=-1)
		{
			System.out.print("The number is negative integer");
		}
		else if(num==0)
		{
			System.out.print("The number is Zero ");

		}
		sc.close();
	}

}
