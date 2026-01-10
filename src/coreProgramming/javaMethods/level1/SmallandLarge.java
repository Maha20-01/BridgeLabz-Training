package level1;
import java.util.Scanner;
public class SmallandLarge {
	
	
	public static int[] find(int num1, int num2, int num3) {
		int largest=num1;
		int smallest=num1;
		if (num2 < smallest)
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;

        if (num2 > largest)
            largest = num2;

        if (num3 > largest)
            largest = num3;

        return new int[]{smallest, largest};
    }
		
		

	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the value of 1: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter the value of 2: ");
	        int num2 = sc.nextInt();
	        System.out.print("Enter the value of 3: ");
	        int num3 = sc.nextInt();

	        int[] result = find(num1, num2, num3);

	        System.out.println("Smallest number: " + result[0]);
	        System.out.println("Largest number: " + result[1]);

}}
