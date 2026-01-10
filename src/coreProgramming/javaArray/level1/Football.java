package level1;
import java.util.Scanner;
public class Football {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("player height");
    double[] heights = new double[11];
    double sum = 0.0;

	for(int i=0;i<heights.length;i++) {
	         
		System.out.println("Enter the height of "+(i+1)+": ");
		heights[i]=sc.nextDouble();
        sum = sum + heights[i];

	}

	double mean=sum / 11;
    System.out.println("Mean height of the football team = " + mean);
}
}