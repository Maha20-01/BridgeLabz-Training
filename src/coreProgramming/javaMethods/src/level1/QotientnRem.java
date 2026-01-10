package level1;
import java.util.Scanner;
public class QotientnRem {

	    public static int[] find(int number, int divisor) {

	        int quotient = number / divisor;   
	        int remainder = number % divisor;  

	        return new int[]{quotient, remainder};
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number 1" );
	        int num1 = sc.nextInt();

	        System.out.print("Enter number 2: ");
	        int num2 = sc.nextInt();


	        int[] result = find(num1, num2);

	        System.out.println("quotient: " + result[0] );
	        System.out.println("Remainder " + result[1]);

	    }
	}
