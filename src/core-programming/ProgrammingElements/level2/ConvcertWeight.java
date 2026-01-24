package level2;
import java.util.Scanner;
public class ConvcertWeight {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  weight in pounds: " );
		double pound=sc.nextFloat();
		
		double kg=pound/2.2;
		System.out.printf(
	            "The weight of the person in pound is %.2f and in kg is %.2f",
	            pound, kg
	        );
		sc.close();}

}
