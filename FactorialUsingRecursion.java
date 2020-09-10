package Recursion;

public class Recursion {

	public static int Fact(int n) throws NegativeNumberException
	{
		if(n < 0)
		{
			throw new NegativeNumberException();
		}
		if(n <= 1)
			return 1;
		else
		return Fact(n-1)*n ;
		
		
	}
	
	public static void main(String[] args) {
       try {
		System.out.println(Fact(-1));
	} catch (NegativeNumberException e) {
		System.out.println("Wrong input plzz try different input");
//		e.printStackTrace();
	}
	}

}
