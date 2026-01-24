package level2;

import java.util.Scanner;
public class DoubleOpt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.print("enter the value a:");
	    double a = sc.nextDouble();
	    System.out.print("enter the value b:");
	    double b = sc.nextDouble();
	    System.out.print("enter the value c:");
	    double c = sc.nextDouble();
	    
	    double op1=a + b *c;
	    double op2= a * b + c;
	    double op3= c + a / b;
	    double op4=  a % b + c;
	    
	    System.out.printf("operation 1= %.2f \n operation 2=  %.2f \n operation 3=  %.2f \n operation 4=  %.2f",op1,op2,op3,op4);
	    sc.close();
	    }
	}

