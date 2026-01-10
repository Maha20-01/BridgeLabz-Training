package level1;
import java.util.Scanner;
public class TwoDtoOneD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:  ");
		int row=sc.nextInt();
		
		System.out.println("Enter number coloumns: ");
		int col=sc.nextInt();
		
		int[][] matrix= new int[row][col];
		
		System.out.println("Enter the matrix elements");
		for(int i=0;i<row;i++) 
	 	{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
	 	}
		int[] array=new int[row*col];
		int index=0;
		 for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                array[index] = matrix[i][j];
	                index++;
	            }
	        }

	        System.out.print("1D Array: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(array[i] + " ");
	        }
	}

}
