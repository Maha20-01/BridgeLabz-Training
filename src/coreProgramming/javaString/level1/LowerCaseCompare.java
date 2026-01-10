package level1;

import java.util.Scanner;

public class LowerCaseCompare {

    public static String convert(String s) 
    {
        String r = "";
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
            {
                r = r + (char)(c + 32);
            } else {
                r = r + c;
            }
        }
        return r;
    }

    public static boolean same(String a, String b) 
    {
        if (a.length() != b.length()) 
        {
            return false;
        }
        for (int i = 0; i < a.length(); i++) 
        {
            if (a.charAt(i) != b.charAt(i)) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String a = convert(s);
        String b = s.toLowerCase();

        boolean r = same(a, b);

        System.out.println(r);

        sc.close();
    }
}
