package level1;
import java.util.Scanner;

public class VariousTriangle {

    public static double[] calctrigonometric(double angle)
    {

        double radians = Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calctrigonometric(angle);

        System.out.printf("Sine(%.2f°) = %.4f%n", angle, result[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, result[1]);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angle, result[2]);

        sc.close();
    }
}
