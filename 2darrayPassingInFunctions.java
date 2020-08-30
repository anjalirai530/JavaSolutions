package arrays2d;
import java.util.Scanner;
public class FunctionsWith2dArray {
	public static void print2darray(int arr[][]) {
		
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
	}
    public static int[][] takeInput()
    {
    	Scanner s = new Scanner(System.in);

    	System.out.println("Enter the number of rows");
    	int rows  = s.nextInt();
    	System.out.println("Enter the number of Cols");
    	int cols  = s.nextInt();
    	int arr[][] = new int[rows] [cols];
    			for(int i=0;i<rows;i++)
    			{
    				for(int j=0;j<cols;j++)
    				{
    					System.out.println("Enter the element at " + i +  "row" + j + "column" );
    					arr[i][j] = s.nextInt();
    					
    				}
    			}

		return arr;
    }
	public static void main(String[] args) {
		
		int [][] arr = takeInput();
		print2darray(arr);
	}

}
