package level2;
import java.util.Scanner;
public class IntOperation {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    System.out.print("enter the value a:");
    int a = sc.nextInt();
    System.out.print("enter the value b:");
    int b = sc.nextInt();
    System.out.print("enter the value c:");
    int c = sc.nextInt();
    
    int op1=a + b *c;
    int op2= a * b + c;
    int op3= c + a / b;
    int op4=  a % b + c;
    
    System.out.print("operation 1= "+op1+"\n operation 2= "+op2+"\n operation 3= "+op3+"\n operation 4= "+op4);
    sc.close();
}
}
