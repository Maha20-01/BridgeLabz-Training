	package level2;
	
	import java.util.Scanner;
	
	public class GreatestFactorWhile {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		    System.out.print("Enter a number : ");
		    int number = sc.nextInt();
		    int greatestFactor=1;
		    int i=number/2;
		    while(i>=1){
		    	if(number%i==0)
		    	{
		    		greatestFactor=i;
		    		break;
		    	}
		    i--;}
		    
		    System.out.print("The greatest factor: "+greatestFactor);
		}}
