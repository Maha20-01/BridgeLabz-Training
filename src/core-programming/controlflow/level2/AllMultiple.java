package level2;

import java.util.Scanner;

public class AllMultiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int number = sc.nextInt();
	    if(number<=0 || number>100) {
			System.out.print("Enter a number from 1 to 100");
			return;
		}
	    
	 for(int i=1;i<=10;i++) {
		 
		 int res = i*number;
		 
		 System.out.println(i+" * "+number+"= "+res);
	 }
	}}
