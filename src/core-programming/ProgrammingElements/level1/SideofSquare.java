package level1;
import java.util.Scanner;
public class SideofSquare {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the perimeter: ");
	int perimeter= sc.nextInt();
	int side=perimeter/4;
	int length=side;
	System.out.print(" The length of the side is "+length+" whose perimeter is"+perimeter);
	sc.close();}
}
