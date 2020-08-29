public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
		// Write your code here
      String ans = "";
		int i;
		int currentWordStart=0;
		for(i=0 ;i < input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				
				int currentWordEnd= i -1;
				String reverseWord ="";
				for(int j=currentWordStart;j<=currentWordEnd;j++)
				{
					reverseWord= input.charAt(j) + reverseWord;
				}
				ans+=reverseWord + " ";
				currentWordStart=i+1;
			}
		}
		
		int currentWordEnd= i -1;
		String reverseWord ="";
		for(int j=currentWordStart;j<=currentWordEnd;j++)
		{
			reverseWord= input.charAt(j) + reverseWord;
		}
		ans+=reverseWord;
		
		return ans;
	}

}
