package level2;
import java.util.Scanner;
public class TrianglePark {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side 1 : ");
        int side1=sc.nextInt();
		System.out.print("Enter the side 2 : ");
        int side2=sc.nextInt();
    	System.out.print("Enter the side 3 : ");
        int side3=sc.nextInt();
         
        int permimeter=side1+side2+side3;
        float totalDistance =5000;
        float totalRound= totalDistance /permimeter;
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km\r\n",totalRound);
        sc.close();
	}
}
