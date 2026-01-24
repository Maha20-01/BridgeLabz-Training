package practiceproblems;
import java.util.Scanner;
public class Volumeofcylinder {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius");
float rad=sc.nextFloat();
System.out.println("Enter the height");
float high=sc.nextFloat();

double vol=Math.PI*Math.pow(rad,2)*high;
System.out.printf("the volume of cylinder is %.2f",vol);
	}}
