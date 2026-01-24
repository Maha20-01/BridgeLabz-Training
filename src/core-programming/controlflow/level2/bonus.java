package level2;
import java.util.Scanner;
public class bonus {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the salary: ");
	int sal=sc.nextInt();
	System.out.print("Enter the year of service: ");
	int yos=sc.nextInt();
	float bonus=sal*0.05f;
	if(yos>5)
	{
		System.out.printf("This employee gets raise %.2f",bonus);
	}
	else {
		System.out.printf("This employee gets salary",sal);
	}
}
}
