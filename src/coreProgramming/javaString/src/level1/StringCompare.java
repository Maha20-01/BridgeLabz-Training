package level1;
import java.util.Scanner;

public class StringCompare {
    public static boolean compare(String a, String b)
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

        String s1 = sc.next();
        String s2 = sc.next();

        boolean r1 = compare(s1, s2);
        boolean r2 = s1.equals(s2);

        if (r1 == r2) {
            System.out.println("Results are same");
        } else {
            System.out.println("Results are different");
        }

        sc.close();
    }
}
