package level1;
import java.util.Scanner;
public class Season {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a month");
	int month=sc.nextInt();
	System.out.print("Enter a day");
	int day=sc.nextInt();
	
	if((month==3 && day>=20)||
	  (month==4 || month==5)||
	  (month==6 || day<=20)){
		System.out.print("It is spring month");
		
	}else {
		System.out.print("It is not Spring month");
	}

}
}
