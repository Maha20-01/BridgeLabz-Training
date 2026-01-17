package level1;
import java.util.Scanner;
public class NaturalNumber {
	    public static int findSum(int n) 
	    {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) 
	        {
	            sum = sum + i;
	        }

	        return sum;
	    }
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("Please enter a positive number");
	        } else {
	            int result = findSum(n);
	            System.out.println("Sum of " + n + " natural numbers is: " + result);
	        }
	        sc.close();
	    }
	}