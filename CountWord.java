
public class Solution {

	public static int countWords(String str){
	
       int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i-1)!=' ')
            {
                count++;
            }
        }
     return count+1;
	}
}
