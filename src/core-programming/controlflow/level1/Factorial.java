package level1;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a positive integer");
	int userInput=sc.nextInt();
	
	if(userInput<=0)
	{
		System.out.print("Enter a positive integer");
		return;
	}
	int fact=1;
	int i=1;
	while(i<=userInput) {
		fact=fact*i;
		i++;
	}
	System.out.print("The factorial : "+fact);
	sc.close();
}
}
