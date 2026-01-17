package level1;
import java.util.Scanner;
public class Voting {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your Age: ");
	int age=sc.nextInt();
	
	if(age>=18)
	{
		System.out.print("Person is eligible to vote");
	} else {
		System.out.print("Person is not eligible");
	}
	sc.close();
}
}
