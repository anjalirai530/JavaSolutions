
public class Solution {
	
		
     public static int staircase(int n){
		
         if(n == 0 || n == 1)
             return 1;
         if(n == 2)
             return 2;
         else
          return   staircase(n-1)+staircase(n-2)+staircase(n-3);
	

	}
	
}