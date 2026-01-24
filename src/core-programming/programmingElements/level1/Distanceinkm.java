package level1;
import java.util.Scanner;
public class Distanceinkm {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter kilometer kilometers to miles:");
	double km= sc.nextDouble();
	float mile=1.6f;
	System.out.printf(" The total miles is : %.2f ",km/mile," mile for the given "+km+"km");
	sc.close();
}
}
