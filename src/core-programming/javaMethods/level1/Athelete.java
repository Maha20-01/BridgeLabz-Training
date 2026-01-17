package level1;
import java.util.Scanner;
public class Athelete {
	
static void calc(int side1,int side2, int side3) {
	int perim=side1 + side2 + side3;
	int totDist=5000;
	int rouncomplete=totDist/perim;
	
	System.out.println("to complete 5 km : "+rouncomplete+" round");
}

	public static void main(String args[]) 
{
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the side 1: ");
	int side1=sc.nextInt();
	
	System.out.print("Enter the side 2: ");
	int side2=sc.nextInt();
	
	System.out.print("Enter the side 3: ");
	int side3=sc.nextInt();
	
	calc(side1,side2,side3);
}
}
