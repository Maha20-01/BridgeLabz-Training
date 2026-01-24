package level1;
import java.util.Scanner;
public class UniversityUserInput {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fee Details");
		
		int fee=sc.nextInt();
		int discountPercent=10;
		int discount = (fee* discountPercent) / 100;
		int discountVariable=fee-discount;
		System.out.println("The discount amount is INR: "+discount+
				                " and final discounted fee is INR:"+discountVariable);
		
		sc.close();
	}
	}


