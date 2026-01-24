package level1;
import java.util.Scanner;
public class HeightinCm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you height:");
		double height=sc.nextDouble();
		
		double inch=height/2.54f;
		double feet=inch/12;
		 System.out.printf(
		            "Your height is %.2f cm\n%.2f inches\n%.2f feet",
		            height, inch, feet
		        );
		 sc.close();
	}

}
