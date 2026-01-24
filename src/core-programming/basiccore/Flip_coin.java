package practiceproblems;
import java.util.Scanner;
public class Flip_coin
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number of times you want to flip the coin:");
	int flips = sc.nextInt();
	
	if(flips<=0)
	{
		System.out.println("enter any positive number");
		return;
	}
	int headflips=0;
	int tailflips=0;
	
	for(int i=0;i<flips;i++)
	{
		double random = Math.random();
		if(random<0.5)
		{
		     headflips++;
		}else {
			tailflips++;
		}
	}
		double headpercentage= ((double)headflips /flips)* 100;
		double tailpercentage=((double)tailflips/flips)*100;
		
		System.out.println("percentage of head flips= "+headpercentage+" head count ="+headflips);
		System.out.println("percentage of Tail flips="+tailpercentage+" Tail count ="+tailflips);
		sc.close();

}
}
