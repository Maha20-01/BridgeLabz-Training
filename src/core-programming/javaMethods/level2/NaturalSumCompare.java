package level2;

import java.util.Scanner;

public class NaturalSumCompare {
    static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static int sumFor(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            sc.close();
            return;
        }
        int r1 = sumRec(n);
        int r2 = sumFor(n);

        System.out.println("Sum using recursion = " + r1);
        System.out.println("Sum using formula = " + r2);

        if (r1 == r2) {
            System.out.println("Both results are correct and equal");
        } else {
            System.out.println("Results are not equal");
        }

    }
}