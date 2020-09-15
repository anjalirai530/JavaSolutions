package Recursion;

import java.util.Scanner;

public class ReplaceBystar {

	public static String  replaceChar(String str)
	{
		if(str.length() == 0 || str.length() == 1)
			return str;
		if(str.charAt(0) == str.charAt(1))
			return str.charAt(0) + "*" + replaceChar(str.substring(1));
		
		else
			return str.charAt(0)+replaceChar(str.substring(1));
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 String str  = s.next();
		 System.out.println(replaceChar(str));


	}

}
