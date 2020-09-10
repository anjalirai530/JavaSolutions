public class Solution {

	public static int count(int n){
		
        
        if(n == 0)
            return 0;
        else
            return count(n/10)+1;
        
        
        
	 }

}