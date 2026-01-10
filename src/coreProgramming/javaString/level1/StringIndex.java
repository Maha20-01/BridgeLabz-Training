package level1;

import java.util.Scanner;

public class StringIndex{

    public static void gen(String s) 
    {
        char c = s.charAt(s.length());
        System.out.println(c);
    }

    public static void handle(String s) 
    {
        try {
            char c = s.charAt(s.length());
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) 
        {
            System.out.println("StringIndexOutOfBoundsException handled");
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
