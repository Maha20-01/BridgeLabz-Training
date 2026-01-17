package level2;

import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int num = sc.nextInt();
	    System.out.print("Enter a Power : ");
	    int pow = sc.nextInt();
	    
	    if(num<=0 ) {
			System.out.print("Enter a number from 1 to 100");
			return;
		}
	    int result=1;
	    for(int i=1;i<=pow;i++) {
	    	
	    	result=num*result;
	    }
    	System.out.println("The result = "+result);

}}
