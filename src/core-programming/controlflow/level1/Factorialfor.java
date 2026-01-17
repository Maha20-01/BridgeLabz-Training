package level1;

import java.util.Scanner;

public class Factorialfor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer : ");
		int userInput=sc.nextInt();
		
		if(userInput<=0)
		{
			System.out.print("Enter a positive integer");
			return;
		}
		int fact=1;
		for(int i=1;i<=userInput;i++) {
			fact=fact*i;
		}
		System.out.print("The factorial : "+fact);
	}
	}
