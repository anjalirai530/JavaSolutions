package Recursion;

public class SumOfNumbers {

		public static int Sum(int n) 
		{
			if(n == 0)
			
				return 0;
			
			else if( n == 1 )
			
				return 1;
			
			else
			return Sum(n-1)+n;
			
			
		}
		
		public static void main(String[] args) {
	       
			System.out.println(Sum(10));
		
	}

}
