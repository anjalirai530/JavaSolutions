package Recursion;
import java.util.Scanner;
public class ArraySorted {

	public static boolean CheckSorted(int A[],int n)
	{
	   if(n==0 || n == 1)	
		   return true;
	   else
	   {
		   if(A[n-2]>A[n-1])
			   return false;
	   }
	  return CheckSorted(A,n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int A[] = new int[n];
		for(int i = 0;i<n;i++)
			A[i] = s.nextInt();
		
		System.out.println(CheckSorted(A,n));
		
		
	}

}
