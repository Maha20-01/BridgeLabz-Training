package level1;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height in cm: ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.printf(
            "Area of triangle in square centimeters is %.2f\n" +
            "Area of triangle in square inches is %.2f",
            areaCm, areaInches
        );
        sc.close();
    }
}
