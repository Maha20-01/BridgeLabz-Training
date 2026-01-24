package level2;
import java.util.Scanner;
public class Chocolates {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print(" Enter number Of chocolates");
		int choco=sc.nextInt();
		System.out.print(" Enter number Of childrens");
		int child=sc.nextInt();
		
		int chocoget= choco/child;
		int remainchoco=choco%child;
		
		System.out.print("The number of chocolates each child gets is : "+chocoget+" and the number of remaining chocolates are : "+remainchoco);
	sc.close();
	}

}
