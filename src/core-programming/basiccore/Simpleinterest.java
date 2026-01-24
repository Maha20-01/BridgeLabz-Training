package practiceproblems;
import java.util.Scanner;
public class Simpleinterest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the principal amount");
	float principal=scanner.nextFloat();
	System.out.println("Enter the Rate ");
	float rate=scanner.nextFloat();
	System.out.println("Enter the Time");
	float Time=scanner.nextFloat();
	
	
	float si=(principal*rate*Time)/100;
	System.out.print("the simple intersest is:"+si);
	scanner.close();
}
}
