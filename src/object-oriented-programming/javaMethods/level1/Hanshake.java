package level1;
import java.util.Scanner;
public class Hanshake {
	
	static void hand(int stu) {
		int maxNum=(stu*(stu-1))/2;
		System.out.print("The maximum handshakes :"+maxNum);
	}
	
	
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number of Students");
	int stu=sc.nextInt();
	
	hand(stu);
}
}
