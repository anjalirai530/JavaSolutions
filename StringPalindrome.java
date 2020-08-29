
public class Solution {

	public static boolean checkPalindrome(String str){
		
        int i=0,j=str.length()-1;
        while(i < j)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                i++;
                j--;
            }
            else if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
        }
        return true;

	}
}
