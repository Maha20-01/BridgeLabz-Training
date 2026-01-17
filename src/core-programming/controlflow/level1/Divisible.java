package level1;
import java.util.Scanner;
public class Divisible {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		if(num%5==0) {
			System.out.print("The number is divisible by 5 ");
		}else {
			System.out.print("It is not divisible");
		}
		sc.close();
	}

}
