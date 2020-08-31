
public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        int m = mat.length;
        if(m==0){
            System.out.println("0");
             return;
        }
           
        int n = mat[0].length;
        int sum=0,i,j;
     for ( i = 0; i < m; i++) { 
      
            for ( j = 0; j < n; j++) { 
      

                 if (i == 0 || j == 0 || i == m - 1|| j == n - 1) { 
                    sum += mat[i][j]; 
                } 
                else if(i==j || (i+j)==n-1)
                {
                    sum+=mat[i][j];
                }
            } 
        } 
        System.out.println(sum);
	}

}