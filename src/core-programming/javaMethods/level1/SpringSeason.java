package level1;
import java.util.Scanner;
public class SpringSeason {

	public static int condition(int day,int month) {
		if((month == 3 && day>=20 )||
		month == 4 || month==5  ||
       (month == 6 && day<=20 )){
		return 1;
	}
		else {
			return 0;
		}}
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the month");
	
int month=sc.nextInt();
System.out.print("Enter the day");

int day=sc.nextInt();

int result=condition(day,month);

if(result==1) {
	System.out.print("It is Spring season");
}else {
	System.out.print("It is not spring season");
}

}
}
