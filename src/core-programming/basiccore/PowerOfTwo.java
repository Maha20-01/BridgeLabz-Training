package practiceproblems;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N (0 to 30):");
        int N = sc.nextInt();
                if(N < 0 || N >= 32) {
            System.out.println("N must be between 0 and 31");
            return;
        }
        System.out.println("Powers of 2 up to 2^" + N + ":");  
        for(int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
        sc.close();
    }
}
