package Practise;
import java.util.Scanner;
public class PrimeNumbers {
   public static int Prime(int n)
   {
	   int flag=0;
	   for(int i=2;i<=n/2;i++)
	   {
		   if(n%i==0)
		   {
			   flag=1;
			   break;
		   }
	   }
	   if(flag==0)
		   return 1;
	   else
		   return 0;
   }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int end = s.nextInt();
		for(int i=2;i<=end;i++)
		{
			if(Prime(i)==1)
			{
				System.out.println(i);
			}
			
		}

	}

}
