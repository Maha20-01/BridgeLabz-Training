package level1;
import java.util.Scanner;
public class FirstSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number 1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter the number 2 : ");
		int num2=sc.nextInt();
		System.out.print("Enter the number 3 : ");
		int num3=sc.nextInt();
		
		if(num1<num2&&num2<num3)
		{
			System.out.print("First number is smallest");
		}
		else {
			System.out.print("No it is not smallest ");
		}
	}

}
