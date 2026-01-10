package level3;
import java.util.Scanner;
public class Primenumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
	    int number = sc.nextInt();
	    if (number <=1) {
            System.out.println("not a prime number");
            return;
	    }
            boolean isPrime = true;

            for (int i = 2; i <= number/2 ; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a Prime number");
            } else {
                System.out.println(number + " is NOT a Prime number");
            }

            sc.close();
        }
    }