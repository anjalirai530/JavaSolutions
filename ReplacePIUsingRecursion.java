package Recursion;

public class ReplacePI {
    
	public static String replacePI(String str)
	{
		if(str.length() <= 1)
			return str;
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i')
			return "3.14"+replacePI(str.substring(2));
		else
			return str.charAt(0)+replacePI(str.substring(1));
	}
	
	public static void main(String[] args) {
	System.out.println(replacePI("apiapipipiip"));
		
	}

}
