package level2;

import java.util.Scanner;

public class PerfectDivisibleWhile {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sc.nextInt();
    if(number<=0) {
		System.out.print("Enter a positive digit");
		return;
	}
    
int  i=1;
while(i<number) {
if(number%i==0) {
    		System.out.println("the value of i"+i);
    	
    	}
i++;
    }
}}
