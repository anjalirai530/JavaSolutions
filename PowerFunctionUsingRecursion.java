public class Solution {

	public static int power(int x, int n) {
		
		if(n == 0)
                   return 1;
         else
             return power(x,n-1)*x;
	}
 }
        //To Reduce time complexity from O(n) to O(logn)
        
       if(n==0)
    
         return 1;
        else
        {
        if(n%2==0)
        {
            return power(x*x,n/2);
        }
        else{
            return x*power(x*x,(n-1)/2);
            }
        }
    }
}
