
public class Solution {
    
    public static String getCompressedString(String input) {
    	//Your code goes here.
         String ans ="";
         int n = input.length();
		for (int i = 0; i < n; i++) { 
            	int count = 1; 
            while (i < n - 1 && 
				input.charAt(i) == input.charAt(i + 1)) { 
				count++; 
				i++; 
			}
            if (count == 1) {
			 ans = ans + input.charAt(i);
            }
            else {
			ans = ans + input.charAt(i);
          ans = ans +count;
          }
		
        }
        
    
    return ans;    
        
    }
}