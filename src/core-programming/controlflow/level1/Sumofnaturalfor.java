package level1;

import java.util.Scanner;

public class Sumofnaturalfor {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a natural number: ");
	        int n = sc.nextInt();
	        if (n <= 0) {
	            System.out.println("Please enter a valid natural number");
	            return;
	        }
	        int total = 0;
	        for(int i=0;i<=n;i++) 
	        {
	            total = total + i;
	        }
	        int formula = n * (n + 1) / 2;
	        System.out.println("Sum using while loop   : " + total);
	        System.out.println("Sum using formula      : " + formula);
	        if (total == formula) {
	            System.out.println("The results are same");
	        }
	    }
	}
