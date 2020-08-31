
public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        int m = mat.length;
        if(m==0)
            return;
        int n = mat[0].length;
    
        for(int j=0;j<n;j++)
        {
             if(j%2==0)
                {
                     for(int i=0;i<m;i++)
                      {
                         System.out.print(mat[i][j] + " ");
               
                      }
                }
            else{
                for(int i=m-1;i>=0;i--)
                      {
                         System.out.print(mat[i][j] + " ");
               
                      }
            }
           
           
        }
	}

}