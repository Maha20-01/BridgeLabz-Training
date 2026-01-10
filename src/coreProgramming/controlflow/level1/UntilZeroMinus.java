package level1;
import java.util.Scanner;
public class UntilZeroMinus {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	 double userInput;
	 double total=0.0;
	 
	 System.out.print("Enter the number(0 to stop) : ");
	 userInput =sc.nextDouble();
	 
	 while(userInput!=0) {
		 total=userInput+total;
		 System.out.print("Enter the number(0 to stop : ");
		 userInput =sc.nextDouble();
		 
		 if(userInput <=0 )
		 {
			 System.out.println("You have entered zero or negative value");
			 break;
		 }
	 }
	 System.out.printf("The sum of number are : %.2f",total);
	 
	 
}
}
