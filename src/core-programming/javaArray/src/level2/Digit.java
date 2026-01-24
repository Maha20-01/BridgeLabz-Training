package level2;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Physics mark" + (i + 1) + ": ");
            marks[i][0] = sc.nextInt();

            System.out.print("Enter Chemistry mark " + (i + 1) + ": ");
            marks[i][1] = sc.nextInt();

            System.out.print("Enter Maths mark " + (i + 1) + ": ");
            marks[i][2] = sc.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 40) {
                grade[i] = "D";
            } else {
                grade[i] = "Fail";
            }
        }

        System.out.println("\nStudent results:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + marks[i][0] +
                " | Chemistry: " + marks[i][1] +
                " | maths: " + marks[i][2] +
                " | percentage: " + percentage[i] +
                " | grade: " + grade[i]
            );
        }
    }
}
