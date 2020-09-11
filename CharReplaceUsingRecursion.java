package Recursion;
import java.util.Scanner;
public class StringsRecursion {

	public static String replaceChar(String s, char a, char b) {
		if(s.length() == 0)
			return s;
		
		if(s.charAt(0) == a)
		{
			return b+replaceChar(s.substring(1),a,b);
		}
		else {
			return s.charAt(0)+replaceChar(s.substring(1),a,b);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		 String str  = s.next();
//		 char a = s.next().charAt(0); 
//		 char b = s.next().charAt(0); 
		System.out.println(replaceChar("anjali",'a','z'));
			

	}

}
