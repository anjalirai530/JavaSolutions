public class Solution {

    public static int sum(int input[],int startIndex)
    {
        if(startIndex == input.length)
        {
            return 0;
        }
        else
            return input[startIndex] + sum(input,startIndex+1);
        
    }
	public static int sum(int input[]) {
		
        
     return  sum(input,0);
		
	}
}