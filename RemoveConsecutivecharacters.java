public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
        String ans ="";
        
            
	
	
	char start = input.charAt(0);
        ans= ans + input.charAt(0);
	for(int i = 1;i<input.length();i++){
		
		char compare = input.charAt(i);
		
		if(compare != start){
			ans = ans + input.charAt(i);
			start = input.charAt(i);
		}       
    }
        return ans;
     
	}
}
