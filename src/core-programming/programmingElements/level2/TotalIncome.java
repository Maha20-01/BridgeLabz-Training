package level2;
import java.util.Scanner;
public class TotalIncome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the salary: ");
	int salary=sc.nextInt();
	System.out.print("Enter the bonus: ");
	int bonus=sc.nextInt();
	int totalIncome=salary+bonus;
	System.out.print(" The salary is INR : " +salary+" and bonus is INR : "+bonus+". Hence Total Income is INR : "+totalIncome);
	sc.close();
}
}
