package practiceproblems;
public class Sumifdigitsarray {
	public static void main(String[] args){
		int generatenumber=randomnumber();
		System.out.println("the random number is"+generatenumber);
		
		int countdigits1=countdigits(generatenumber);
		{
			System.out.println(countdigits1);
			
		}
		
	}

public static int randomnumber(){
	return(int)(Math.random()*9000) +1000;
	
}
public static int countdigits(int number) {
	int count=0;
	while(number!=0) {
		count++;
		number=number/10;
		
	}
	return count;
}
}