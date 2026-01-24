package practiceproblems;
import java.util.Scanner;
public class ConvertKilometers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the distance in kilometer");
	float km=sc.nextFloat();
	
	double miles=km*0.621371;
	System.out.print("the miles is :"+miles);
	sc.close();
}

}
