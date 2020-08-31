
public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int m=matrix.length;
        if(m==0)
            return;
        int n=matrix[0].length;
        int i,k=0,l=0;
        int last_row=m-1,last_col=n-1;
        while(k<=last_row && l<=last_col)
        {
            for(i=l;i<=last_col;i++)
            {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for(i=k;i<=last_row;i++)
            {
                System.out.print(matrix[i][last_col] + " ");
            }
            last_col--;
            if(k<=last_row)
            {
                for(i=last_col;i>=l;i--)
                {
                    System.out.print(matrix[last_row][i] + " ");
                }
                last_row--;
            }
            if(l<=last_col)
            {
                for(i=last_row;i>=k;i--)
                {
                    System.out.print(matrix[i][l] + " ");
                }
            }
            l++;
            
        }
        
        
        
	}
}