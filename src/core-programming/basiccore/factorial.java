package practiceproblems;
import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        System.out.println("Prime factors of " + N + " are:");

        for (int i=2; i*i <= N;i++) {
            while (N % i == 0) {  
                System.out.print(i + " ");
                N = N / i;       
            }
        }
        if (N > 1) 
        {
            System.out.print(N);
        }
    }
}
