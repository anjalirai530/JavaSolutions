
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
        
        int len = input.length()-1;
        if(input.length() == 0)
            return  0;
        double x = input.charAt(0) - '0'; 
  
        double y = convertStringToInt(input.substring(1)); 
        x = x * Math.pow(10, input.length() - 1) + y; 
       return (int)(x); 
       

	}
}
