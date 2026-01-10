package level1;
import java.util.Scanner;
public class OddandEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		if(num<=0)
		{
			System.out.print("Enter a positive integer");
			return;
		}
		
		for(int i=1;i<=num;i++)
		{
			
			
			if(i % 2==0)
			{
				System.out.println(i+" this is even number");
			}else
			{
				System.out.println(i+" this is odd number");
			}
		
		
		}
		
	}
}
