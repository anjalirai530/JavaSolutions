package Recursion;
import java.util.Scanner;
public class BinarySearch {

	public static int  Binary(int A[],int l,int h,int key)
	{
		if(h < l)
			return -1;
		
		if(A[l]==key)
			return l;
		if(A[h] ==key)
			return h;
		else
			return Binary(A,l+1,h-1,key);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int A[] = new int[n];
		for(int i = 0;i<n;i++)
			A[i] = s.nextInt();
		int key = s.nextInt();
		int l=0,h=A.length-1;
		System.out.println(Binary(A,l,h,key));
	}

}
