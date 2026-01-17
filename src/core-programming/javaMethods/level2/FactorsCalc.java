package level2;

import java.util.Scanner;

public class FactorsCalc {

    static int[] getFactors(int n) {
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        int[] f = new int[c];
        int j = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f[j] = i;
                j++;
            }
        }

        return f;
    }
    static int sum(int[] f) {
        int s = 0;
        for (int i = 0; i < f.length; i++) {
            s += f[i];
        }
        return s;
    }
    static long product(int[] f) {
        long p = 1;
        for (int i = 0; i < f.length; i++) {
            p *= f[i];
        }
        return p;
    }
    static double sumSquare(int[] f) {
        double s = 0;
        for (int i = 0; i < f.length; i++) {
            s += Math.pow(f[i], 2);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int[] f = getFactors(n);

        System.out.print("Factors: ");
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }

        System.out.println();
        System.out.println("Sum = " + sum(f));
        System.out.println("Sum of squares = " + sumSquare(f));
        System.out.println("Product = " + product(f));

        sc.close();
    }
}