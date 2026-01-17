package level1;
import java.util.Scanner;
public class UntilZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double userInput;
		double total=0.0;
		
		System.out.print ("Enter a number (0 to stop): ");
		userInput=sc.nextDouble();
		while(userInput!=0) {
			
			total=userInput+total;
			
			System.out.print("Enter a number (0 to stop): ");
			userInput=sc.nextDouble();
		}
		System.out.printf("The sum of number is %.2f\n",total);

		if(userInput==0) {
			System.out.println("Stopping....");
		}
		
	}

}
