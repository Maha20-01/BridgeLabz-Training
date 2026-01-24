package level2;
import java.util.Scanner;

public class Quotient {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number 1: ");
		int num1=sc.nextInt();
		System.out.print("Enter the number 2: ");
		int num2=sc.nextInt();
		
		float quotient=num1/num2;
		float remainder=num1%num2;
		
		System.out.printf("The Quotient is %.2f\n and Reminder is %.2f\n of two number %d and %d",quotient,remainder,num1,num2);
		sc.close();
	}

}
