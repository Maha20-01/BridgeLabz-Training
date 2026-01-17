package level3;

import java.util.Scanner;

public class CountInt {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int count=0;
    while(number>0)
    {
    	int digit=number%10;
    	number=number/10;
    	count++;
    }
    System.out.print("The number of digits are:"+count);
}
}
