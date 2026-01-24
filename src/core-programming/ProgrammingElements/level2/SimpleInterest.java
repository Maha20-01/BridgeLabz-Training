package level2;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the prinicipal amount");
		float principal=sc.nextFloat();
		System.out.print("Enter the Rate of Interest");
		float rate=sc.nextFloat();
		System.out.print("Enter the Time");
		float time=sc.nextFloat();
		
		double SimpleIntrest=principal*rate*time/100;
		System.out.printf("The Simple Interest is %.2f \nfor Principal %.2f \nRate of Interest %.2f and Time %.2f\r\n",
				SimpleIntrest,principal,rate,time);
		
		sc.close();
		
	}

}
