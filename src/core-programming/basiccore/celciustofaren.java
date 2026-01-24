package practiceproblems;
import java.util.Scanner;
public class celciustofaren {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the celcuis:");
	float celc=sc.nextFloat();
	
	float faren=(celc*9/5)+32;
	System.out.println("the farenheit="+faren);
}
}
