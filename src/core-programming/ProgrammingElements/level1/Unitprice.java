package level1;
import java.util.Scanner;
public class Unitprice {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the unit price");
	int price=sc.nextInt();
	System.out.print("Enter the quantity to be bought");
	int quantity=sc.nextInt();
	
	int total=price* quantity;
	System.out.println("The total purchase price is INR:"+total+" \n if the quantity: "+quantity+" and unit price is INR : "+price);
	sc.close();
	}
}
