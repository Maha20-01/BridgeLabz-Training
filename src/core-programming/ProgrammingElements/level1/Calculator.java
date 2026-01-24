package level1;
import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print(" Enter the first number");
	float number1=sc.nextFloat();
	System.out.print(" Enter the Second number");
	float number2=sc.nextFloat();
	
 float add=number1+number2;
 float sub=number1-number2;
 float mul=number1*number2;
 float div=number1/number2;
 System.out.printf("The addition is: %.2f\n the subtraction is: %.2f \n the multiplication: %10.2f\n the division is: .%2f\n ",add,sub,mul,div);
 sc.close();


	
}
}
