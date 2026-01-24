package practiceproblems;
import java.util.Scanner;
public class Basetoexpo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number:");
		int base=sc.nextInt();
		System.out.println("Enter the exponential number:");
		int expo=sc.nextInt();
		
		double result=Math.pow(base, expo);
		System.out.println("The result of base "+base+" and "+" expo "+expo+"is : "+result );
	}

}
