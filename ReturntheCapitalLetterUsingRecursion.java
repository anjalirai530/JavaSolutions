package Recursion;
import java.util.Scanner;
public class ReturnChar {
    
	public static char returnChar(String str) {
		if(str.length() == 0)
			return 0;
		
		 if(str.length() == 0)
		      return 0;
		    if(str.charAt(0) >= 'A' && str.charAt(0) <='Z')
		    	 System.out.println(str.charAt(0));
		      return returnChar(str.substring(1));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 String str  = s.next();
		returnChar(str);

	}

}
	
	
	