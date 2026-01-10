package level2;

import java.util.Scanner;

public class GreatestFactor {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sc.nextInt();
    int greatestFactor=1;
    for(int i=number/2;i>=1;i--) {
    	if(number%i==0)
    	{
    		greatestFactor=i;
    		break;
    	}
    }
    
    System.out.print("The greatest factor: "+greatestFactor);
}}
