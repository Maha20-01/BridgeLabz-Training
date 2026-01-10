package level2;

import java.util.Scanner;

public class Multilpeunder100While {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int number = sc.nextInt();
	    if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100");
            return;
        }
        System.out.println("Multiples (factors) of " + number + " below 100:");
        for (int counter = number - 1; counter > 1; counter--) {

            if (number % counter == 0) {
                System.out.println(counter);
            }
        }
    }
}