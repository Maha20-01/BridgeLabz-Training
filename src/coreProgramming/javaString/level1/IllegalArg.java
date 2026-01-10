package level1;

import java.util.Scanner;

public class IllegalArg {

    public static void gen(String s) 
    {
        String r = s.substring(5, 2);
        System.out.println(r);
    }

    public static void handle(String s) 
    {
        try {
            String r = s.substring(5, 2);
            System.out.println(r);
        } catch (IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        gen(s);
        handle(s);

        sc.close();
    }
}
