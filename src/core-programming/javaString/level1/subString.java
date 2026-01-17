package level1;
import java.util.Scanner;

public class subString {

    public static String makeSub(String s, int start, int end) 
    {
        String r = "";
        for (int i = start; i < end; i++)
        {
            r = r + s.charAt(i);
        }
        return r;
    }

    public static boolean check(String a, String b) 
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

        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = makeSub(s, start, end);
        String s2 = s.substring(start, end);

        
        
        boolean res = check(s1, s2);

        System.out.println(res);

        sc.close();
    }
}
