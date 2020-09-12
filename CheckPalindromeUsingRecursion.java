
public class solution {

    public static boolean helper(String A,int l,int h)
    {
        if(A.length() == 1 || A.length() == 0)
            return true;
        if(A.charAt(l) != A.charAt(h))
            return false;
        if(l<= h)
           return helper(A,l+1,h-1);
        
        return true;
    }
    
	public static boolean isStringPalindrome(String input) {
		// Write your code here
        int l =0;
        int h = input.length() -1;
        return helper(input,l,h);
        

	}
}
