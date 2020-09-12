
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
        int sum = 0;
        if(input == 0)
            return 0;
        else
        {
              return sumOfDigits(input/10) + input%10;
               

        }

	}
}
