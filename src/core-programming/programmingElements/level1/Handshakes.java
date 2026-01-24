package level1;
import java.util.Scanner;
public class Handshakes {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number Of Students: ");
	int numberOfStudents=sc.nextInt();
	int n=numberOfStudents;
	int handshakes= (n * (n - 1)) / 2;
	System.out.println("maximum number of possible handshakes:"+handshakes);
	sc.close();
}
}
