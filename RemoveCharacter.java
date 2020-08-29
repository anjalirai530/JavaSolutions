public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
        String ans = "";
    for(int i=0;i<input.length();i++)
    {
        if(input.charAt(i)!=c){
            ans = ans + input.charAt(i) ;
        
          }
        
	}
         return ans;
    }
       

}
