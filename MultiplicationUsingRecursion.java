
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        if(m == 0 || n ==0)
            return 0;
        else
          return  m+multiplyTwoIntegers(m,n-1);
	}
}
