package level1;

import java.util.Scanner;

public class UpperCaseCompare {

    public static String convert(String s) 
    {
        String r = "";
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
            
            {
                r = r + (char)(c - 32);
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

        String s1 = convert(s);
        String s2 = s.toUpperCase();

        boolean r = same(s1, s2);

        System.out.println(r);

        sc.close();
    }
}
