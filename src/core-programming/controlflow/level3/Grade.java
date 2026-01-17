package level3;
import java.util.Scanner;
public class Grade {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter mark of physics : ");
	int phyc=sc.nextInt();
	System.out.print("Enter mark of chemistry : ");
	int chem=sc.nextInt();
	System.out.print("Enter mark of maths : ");
	int maths=sc.nextInt();
	int result=phyc+chem+maths;
	double per=(result/300.0)*100;
	
	System.out.printf("the percentage is %.2f\n",per);
	 if(per>=80)
	 {
		 System.out.println("GRADE A"
		 		+ "REMARK: Level 4, above agency-normalized standards");
		 
	 }
	 else if(per>=70 && per<=79)
	 {
		 System.out.println("GRADE b"
		 		+ "REMARK: Level 3, at agency normalised standards");
		 
	 }
	 else if(per>=60 && per<=69)
	 {
		 System.out.println("GRADE C"
		 		+ "REMARK: Level 2, below, but approaching agency-normalized standards");		 
	 }else if(per>=50 && per<=59)
	 {
		 System.out.println("GRADE d"
		 		+ "REMARK: Level 1, will below agency-normalized standards");		 
	 }
	 else if(per>=40 && per<=49)
	 {
		 System.out.println("GRADE E"
		 		+ "REMARK: Level -1, too below agency normalized standards");		 
	 }
	 else {
		 System.out.println("GRADE R"
			 		+ "REMARK: Remedial Students");		 
	 }
	 
}
}
