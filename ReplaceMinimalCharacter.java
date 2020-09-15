package Practise;

import java.util.Scanner;

public class PairWiseDistinct {

	public static void pairwise(String str)
	{
		int H[] = new int[26];
		int i=0,j=0;
		if(str.length()>26)
			System.out.println("IMPOSSIBLE");
		for(i=0;i<str.length();i++)
		{
			H[str.charAt(i) -'a']++;
		}
		for(i=0;i<str.length();i++)
		{
			if(H[str.charAt(i)-'a']>1)
			{
				for(j=0;j<26;j++)
				{
					if(H[j] == 0)
					{
						H[str.charAt(i)-'a']--;
						str = str.substring(0,i)+(char)(j+'a')+str.substring(i+1);
						H[j]++;
						break;
					}
				}
			}
			
		}
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 String str  = s.next();
		 pairwise(str);

	}

}
