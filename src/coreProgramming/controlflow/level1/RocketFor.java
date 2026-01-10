package level1;

import java.util.Scanner;

public class RocketFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a counter value : ");
		int counter=sc.nextInt();
		
		for(int i=counter;i>=1;i--)
		{
			System.out.println(i);
		}
	}

}
