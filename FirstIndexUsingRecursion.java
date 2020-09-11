package Recursion;

import java.util.Scanner;

public class FirstIndex {

	public static int findIndex(int A[],int firstIndex,int x)
	{
		if(firstIndex == A.length)
			return -1;
		if(A[firstIndex] == x)
			return firstIndex;
		else
			return findIndex(A,firstIndex+1,x);
	}
	
	public static void main(String[] args) {
	
		
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int A[] = new int[n];
		for(int i = 0;i<n;i++)
			A[i] = s.nextInt();
		int x = s.nextInt();
		System.out.println(findIndex(A,0,x));

	}

}
