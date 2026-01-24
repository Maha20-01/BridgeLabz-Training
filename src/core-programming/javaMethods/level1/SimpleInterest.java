package level1;
import java.util.Scanner;
public class SimpleInterest {
	public class si {

	    static void si(float prin, float rate, float time) 
	    {
	        double res = (prin * rate * time) / 100;
	        System.out.printf("The Simple Interest is %.2f", res);
	    }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the principle : ");
	float prin=sc.nextFloat();
	
	System.out.print("Enter the rate : ");
	float rate=sc.nextFloat();
	System.out.print("Enter the time : ");
	float time=sc.nextFloat();
	
	si(prin,rate,time);
	
}

}
}