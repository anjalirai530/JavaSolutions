
public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
int max = Integer.MIN_VALUE; 
        String s = "";
         int q = 0;
  int sum=0;
  int m=mat.length;
        if(m==0)
        {
          s = "row";  
          System.out.println(s + " "  + q + " " + max);
            return;
        }
  int n=mat[0].length;
  
 

  for(int i=0; i<m; i++)
  {
    sum=0;
    for(int j=0; j<n; j++)
    {
      sum =sum +mat[i][j];

    }
    if(sum>max){
      max = sum;
      q = i;
      s = "row";
    }
    }
  
  for(int j=0; j<n; j++)
  {
    sum=0;
    for(int i=0; i<m; i++)
    {
      sum=sum+mat[i][j];

    }
  if(sum>max){
    max = sum;
    q = j;
    s = "column";
  } 
  }
  System.out.println(s + " "  + q + " " + max);

        
	}

}