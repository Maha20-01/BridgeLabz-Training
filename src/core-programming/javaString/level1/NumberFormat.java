package level1;
import java.util.Scanner;

public class NumberFormat {

    public static void gen(String t) 
    {
        int n = Integer.parseInt(t);
        System.out.println(n);
    }

    public static void handle(String t) 
    {
        try {
            int n = Integer.parseInt(t);
            System.out.println(n);
        } catch (NumberFormatException e) 
        {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) 
        {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String t = sc.next();

        
        gen(t);
        handle(t);

        sc.close();
    }
}
