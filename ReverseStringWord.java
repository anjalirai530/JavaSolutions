package Strings;

public class ReverseWord {
	
    public static String Reverse(String str)
    {
    	String ans = "";
    	int space = str.length();
    	for(int j=str.length()-1;j>=0;j--)
    	{
    		if(j==0)
    		{
    			ans = ans + str.substring(0,space);
    		}
    		else if(str.charAt(j)==' ') {
    			ans= ans + str.substring(j+1,space) + " ";
    			space = j;
    			
    			
    		}
    	}
    	
    	return ans;
    }
	public static void main(String[] args) {
      String str = "abc d efg ghi";
      String str1= Reverse(str);
      System.out.println(str1);
      
	}

}
