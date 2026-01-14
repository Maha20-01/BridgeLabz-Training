package extrabuitin;

import java.util.Scanner;

public class DateFormatting {

    public static void main(String[] args) {

        long currentMillis = System.currentTimeMillis();

        long totalSeconds = currentMillis / 1000;
        long totalDays = totalSeconds / (24 * 60 * 60);

        int year = 1970;
        int month = 1;
        int day = 1;

        long daysLeft = totalDays;

        while (daysLeft >= (isLeapYear(year) ? 366 : 365)) {
            daysLeft -= (isLeapYear(year) ? 366 : 365);
            year++;
        }

        int[] daysInMonth = getDaysInMonth(year);

        for (int i = 0; i < 12; i++) {
            if (daysLeft < daysInMonth[i]) {
                month = i + 1;
                day = (int) daysLeft + 1;
                break;
            } else {
                daysLeft -= daysInMonth[i];
            }
        }

        String format1 = String.format("%02d/%02d/%04d", day, month, year);

        String format2 = String.format("%04d-%02d-%02d", year, month, day);

        String[] weekdays = {"Thu", "Fri", "Sat", "Sun", "Mon", "Tue", "Wed"}; // 1 Jan 1970 was Thursday
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int weekdayIndex = (int)((totalDays + 4) % 7); // 1 Jan 1970 was Thursday (+4)
        String format3 = weekdays[weekdayIndex] + ", " + months[month - 1] + " " + day + ", " + year;

        System.out.println("dd/MM/yyyy : " + format1);
        System.out.println("yyyy-MM-dd : " + format2);
        System.out.println("EEE, MMM dd, yyyy : " + format3);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int[] getDaysInMonth(int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        return daysInMonth;
    }

    public static class DateComparison {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first date:");
            int day1 = getInput(scanner, "Day: ");
            int month1 = getInput(scanner, "Month: ");
            int year1 = getInput(scanner, "Year: ");

            System.out.println("Enter second date:");
            int day2 = getInput(scanner, "Day: ");
            int month2 = getInput(scanner, "Month: ");
            int year2 = getInput(scanner, "Year: ");

            int result = compareDates(day1, month1, year1, day2, month2, year2);

            if (result < 0) {
                System.out.println("The first date is before the second date.");
            } else if (result > 0) {
                System.out.println("The first date is after the second date.");
            } else {
                System.out.println("Both dates are the same.");
            }

            scanner.close();
        }

        public static int getInput(Scanner scanner, String prompt) {
            System.out.print(prompt);
            return scanner.nextInt();
        }

        public static int compareDates(int day1, int month1, int year1,
                                       int day2, int month2, int year2) {
            if (year1 != year2) {
                return (year1 < year2) ? -1 : 1;
            } else if (month1 != month2) {
                return (month1 < month2) ? -1 : 1;
            } else if (day1 != day2) {
                return (day1 < day2) ? -1 : 1;
            } else {
                return 0;
            }
        }
    }
}
