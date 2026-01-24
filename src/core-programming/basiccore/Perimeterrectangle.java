package practiceproblems;
import java.util.Scanner;
public class Perimeterrectangle {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the length: ");
	float len=sc.nextFloat();
	System.out.print("Enter the width: ");
	float width=sc.nextFloat();
	
	float perimeter = 2*(len+width);
	System.out.printf("the perimeter %.2f",perimeter);

}}
