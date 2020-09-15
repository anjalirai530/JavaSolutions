

import java.util.Scanner;

public class FirstLast {

	public static int returnSubstring(String str)
	{
		String ans = "";
		int count = 0;
		int n = str.length();
		int i=0,j=0;
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				ans=str.substring(i,j+1);
				if(str.charAt(i) == str.charAt(j))
					count++;
			}
		}
		return count;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 String str  = s.next();
		 System.out.println(returnSubstring(str));


	}

}
