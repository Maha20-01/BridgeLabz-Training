package level1;
import java.util.Scanner;

public class CompareResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number");
            return;
        }
        int total = 0;
        int i = 1;
        while (i <= n) {
            total = total + i;
            i++;
        }
        int formula = n * (n + 1) / 2;
        System.out.println("Sum using while loop   : " + total);
        System.out.println("Sum using formula      : " + formula);
        if (total == formula) {
            System.out.println("The results are same");
        }
        sc.close();
    }
}
