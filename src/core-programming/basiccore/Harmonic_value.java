package practiceproblems;
import java.util.Scanner;
public class Harmonic_value {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
		System.out.println("Enter upto which number Harmonic value need ");
		int N= sc.nextInt();
		
		if(N==0)
		{
			System.out.println("start from 1");
			return;
		}
		
	double harmonic=0.0;
	
	for(int i=1;i<=N;i++) {
		  harmonic += 1.0 / i;
	}
    System.out.println("The " +N+ "th Harmonic Number is: " + harmonic);
    sc.close();
}
}
