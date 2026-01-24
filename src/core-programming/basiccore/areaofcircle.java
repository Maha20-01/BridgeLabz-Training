package practiceproblems;
import java.util.Scanner;
public class areaofcircle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the radius: ");
	float rad=sc.nextFloat();
	
	double area=Math.PI*Math.pow(rad,2);
	System.out.printf(" The area is: %.2f",area);
	
}
}
