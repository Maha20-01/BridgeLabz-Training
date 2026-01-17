package level2;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Age Amar : ");
    int age1 = sc.nextInt();
 
    System.out.print("Enter a Age Akbar: ");
    int age2 = sc.nextInt();
    System.out.print("Enter a Age Anthony : ");
    int age3 = sc.nextInt();
    System.out.print("Enter a Height Amar : ");
    int height1 = sc.nextInt();
    System.out.print("Enter a Height Akbar : ");
    int height2 = sc.nextInt();
   
    System.out.print("Enter a Height Anthony: ");
    int height3 = sc.nextInt();
    
    if(age1<=age2 && age1<=age3)
    {
    	System.out.println(" Amar is young ");
    }
    else if (age2<=age1 && age2<=age3)
    {
    	System.out.println(" Akbar is young ");
    }
    
    else
    {
    	System.out.println(" Anthony is young ");
    }
    
    if(height1>=height2 && height1>=height3)
    {
    	
    	System.out.println(" Amar is Height ");

    }
    else if (height2>=height1 && height2>=height3)
    {
 
    	System.out.println(" Akbar is Height ");
    }
    else
    {
    	System.out.println(" Anthony is Height ");
    }
}
}
