package level2;

import java.util.Scanner;

public class LeapYear
{

    static boolean isLeapYear(int y) {

        if (y < 1582) {
            return false;
        }

        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        }
        return false;
    }

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        if (isLeapYear(y)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        sc.close();
    }
}
