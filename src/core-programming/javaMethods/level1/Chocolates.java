package level1;
import java.util.Scanner;

public class Chocolates {

    public static int[] find(int number, int divisor) {

        int quotient = number / divisor;   
        int remainder = number % divisor;  

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int nOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int nOfChildren = sc.nextInt();

        if (nOfChildren <= 0) {
            System.out.println("Number of children must be greater than zero");
            sc.close();
            return;
        }

        int[] result = find(nOfChocolates, nOfChildren);

        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

    }
}
