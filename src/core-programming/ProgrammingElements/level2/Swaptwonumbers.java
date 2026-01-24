package level2;
import java.util.Scanner;
public class Swaptwonumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number 1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter the number 2 : ");
		int num2=sc.nextInt();
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.print("The swapped numbers are " +num1+" and " +num2);
		sc.close();
	}

}
