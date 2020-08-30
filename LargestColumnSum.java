package arrays2d;
import java.util.Scanner;
public class LargestColumnSum {
	
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
    public static int largest2dSum(int arr[][])
    {
    	
    	int rows = arr.length;
		int cols = arr[0].length;
		int largest = Integer.MIN_VALUE;
    	for(int j=0;j<cols;j++)
		{
    		int sum=0;
			for(int i=0;i<rows;i++)
			{
				sum+=arr[i][j];
				
			}
			if(sum>largest)
			{
				largest = sum;
			}
		}
    	
    	return largest;
    }
	public static void main(String[] args) {

		int [][] arr = takeInput();
		System.out.println(largest2dSum(arr));
	}

}
