package level2;
import java.util.Scanner;
public class TravelDis {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the name of the person: ");   
    String name=sc.nextLine();
    System.out.print("Enter the name of the city from: ");   
    String fromCity=sc.nextLine();
    System.out.print("Enter the name of the city Via: ");   
    String viaCity=sc.nextLine();
    System.out.print("Enter the name of the city To: ");   
    String toCity=sc.nextLine();
    System.out.print("Enter the distance From To Via: ");   
    double distanceFromToVia=sc.nextDouble();
    System.out.print("Enter the time Via To FinalCity: ");   
    double timeViaToFinalCity=sc.nextDouble();
    System.out.print("Enter the time Via To FinalCity: ");   
    int timeFromToVia=sc.nextInt();
    System.out.print("Enter the distance Via To FinalCity: ");   
    double distanceViaToFinalCity=sc.nextDouble();

  
   double totalDistance = distanceFromToVia + distanceViaToFinalCity;

   double totalTime = timeFromToVia + timeViaToFinalCity;

   System.out.println("The Total Distance travelled by " + name + " from " + 
                      fromCity + " to " + toCity + " via " + viaCity +
                      " is " + totalDistance + " km and " +
                      "the Total Time taken is " + totalTime + " minutes");
   sc.close();}
}

