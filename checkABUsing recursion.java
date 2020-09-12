public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
        if(input.length() == 0)
            return true;
         if(input.charAt(0) != 'a')
             return false;
        if(input.length() >= 3 && "abb".equals(input.substring(0,3)))
            return checkAB(input.substring(3));
        return checkAB(input.substring(1));
	}
}
